/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusController;
import java.util.Date;
import java.util.List;
import sistemperpusModel.*;
import sistemperpusView.*;
/**
 *
 * @author Mira
 */
public class olahAnggotaController {

    Anggota A;
   
    public void openAnggota (){
        olahAnggotaView view = new olahAnggotaView();
        view.setVisible(true);
    }
    
    public List<Anggota> initData(){
        return A.getAll();
    }
    
    public List<Anggota> addAnggota (String NIPM, String passwd, String Jabatan, 
            int Total, Date Expire, double Denda, List<Anggota> rep){
        A = new Anggota (NIPM, passwd, Jabatan, Total, Expire, Denda);
        rep.add(A);
        return rep;
    }
    
    public List<Anggota> deleteAnggota (String NIPM, List<Anggota> rep){
        for(int i=0; i<rep.size(); i++){
            if(rep.get(i).getNIPM().equals(NIPM))
                rep.remove(i);
        }
        return rep;
    }
    
    public List<Anggota> updateAnggota (String NIPM, String passwd, String Jabatan, 
            int Total, Date Expire, double Denda, List<Anggota> rep){
        
        int index = 0; int i = 0;
        while(!rep.get(i).getNIPM().equals(NIPM)){
                i++;
        }
        index = i;
        rep.get(index).setNIPM(NIPM);
        rep.get(index).setPassword(passwd);
        rep.get(index).setJabatan(Jabatan);
        rep.get(index).setTotalPinjam(Total);
        rep.get(index).setTglExpire(Expire);
        rep.get(index).setDenda(Denda);
        
        return rep;
    }
    
}
