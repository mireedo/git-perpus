/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusRepositories;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import sistemperpusModel.Anggota;
/**
 *
 * @author Mira
 */
public class anggotaRepository implements Repository<Anggota> {
    
    private String nipm;
    private String password;
    private String jabatan;
    private int total_pinjam;
    private Date tgl_expire;
    private double denda;
    
    List<Anggota> list = new ArrayList();
    
    public List<Anggota> createData() throws ParseException{
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        Anggota A = new Anggota ("121524019","mira","Mahasiswa",0,dt.parse("31/12/2015"),0);
        Anggota B = new Anggota ("121524007","ine","Mahasiswa",0,dt.parse("31/12/2015"),0);
        Anggota C = new Anggota ("1123129898212","maman","Dosen",2,dt.parse("30/01/2016"),0);
        list.add(A); list.add(B); list.add(C);
        return list;
    }
    
    @Override
    public List<Anggota> FindAll() {
        try {
            list = createData();
        }
        catch(ParseException e){ 
        }
        return list;
    }

    @Override
    public Anggota get(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return list.get(id);
    }

    @Override
    public void add(Anggota t) {
        list.add(t);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Anggota t) {
        list.remove(t);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(int id, Anggota t) {
        Anggota A = list.get(id);
        A.setNIPM(t.getNIPM());
        A.setPassword(t.getPassword());
        A.setJabatan(t.getJabatan());
        A.setTglExpire(t.getTglExpire());
        A.setTotalPinjam(t.getTotalPinjam());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
