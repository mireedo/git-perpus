/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusModel;

import sistemperpusRepositories.*;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Mira
 */
public class Peminjaman {
    public String nipm;
    public String isbn;
    public Date tgl_pinjam;
    public Date tgl_kembali;
    
    peminjamanRepository repository = new peminjamanRepository();
    
    public Peminjaman (String NIPM, String ISBN, Date pinjam, Date kembali){
        this.nipm = NIPM;
        this.isbn = ISBN;
        this.tgl_pinjam = pinjam;
        this.tgl_kembali = kembali;
    }
    
    public Peminjaman (){
        
    }
    
    public List<Peminjaman> getAll(){
        return repository.FindAll();
    }
}
