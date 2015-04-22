/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusModel;

import java.util.Date;
import java.util.List;
import sistemperpusRepositories.anggotaRepository;        
        
/**
 *
 * @author Mira
 */
public class Anggota {
    private String nipm;
    private String password;
    private String jabatan;
    private int total_pinjam;
    private Date tgl_expire;
    private double denda;
    
    anggotaRepository repository = new anggotaRepository();
    
    public Anggota (String NIPM, String passwd, String Jabatan, 
            int Total, Date Expire, double Denda)
    {
        this.nipm = NIPM;
        this.password = passwd;
        this.jabatan = Jabatan;
        this.total_pinjam = Total;
        this.tgl_expire = Expire;
        this.denda = Denda;
    }
    
    public Anggota (String NIPM, String passwd){
        this.nipm = NIPM;
        this.password = passwd;
    }
    
    public Boolean Login (String NIPM, String Password){
        try {
            List<Anggota> listAnggota = repository.FindAll();
            System.out.println("Anggota");
            Boolean status=false;
            int i=0;
            while (!status && i < listAnggota.size()){
                System.out.println("Element "+i+listAnggota.get(i).nipm);
                if (listAnggota.get(i).nipm.equals(NIPM) && 
                        listAnggota.get(i).password.equals(Password)){
                    status = true;
                }
                else
                    i++;
            }
            return status;     
        }
        catch(Exception e){
            return false;
        }
    }
    
    public String getNIPM (){
        return this.nipm;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getJabatan(){
        return this.jabatan;
    }
    
    public int getTotalPinjam(){
        return this.total_pinjam;
    }
    
    public Date getTglExpire(){
        return this.tgl_expire;
    }
    
    public double getDenda(){
        return this.denda;
    }
    
    public void setNIPM(String NIPM){
        this.nipm = NIPM;
    }
    
    public void setPassword (String passwd){
        this.password = passwd;
    }
    
    public void setJabatan(String Jabatan){
        this.jabatan = Jabatan;
    }
    
    public void setTotalPinjam(int Pinjam){
        this.total_pinjam = Pinjam;
    }
    
    public void setTglExpire(Date Expire){
        this.tgl_expire = Expire;
    }
    
    public void setDenda(double Denda){
        this.denda = Denda;
    }
}
