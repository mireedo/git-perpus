/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sistemperpusModel.*;
import sistemperpusView.*;
/**
 *
 * @author Mira
 */
public class peminjamanController {
    Peminjaman P = new Peminjaman();
    
    public void openDataPinjam (){
        peminjamanView view = new peminjamanView();
        view.setVisible(true);
    }
    
    public List<Peminjaman> initData(){
        return P.getAll();
    }
    
    public void openFormPinjam (Buku A){
        formPinjam fView = new formPinjam(A);
        fView.setVisible(true);
    }
    
    public Peminjaman initForm (Buku A) {
        Peminjaman temp = new Peminjaman();

            SimpleDateFormat dt = new SimpleDateFormat("dd/MM/YYYY");
            Date date = new Date();
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.DATE, 7);
           
            temp = new Peminjaman ("", A.getISBN(), date, c.getTime());

            return temp;

    }
    
    public void pinjam (Peminjaman peminjaman, List<Anggota> aRep, List<Buku>bRep){
        //List[] container = new ArrayList[2];
        olahBukuController bContr = new olahBukuController();
        olahAnggotaController aContr = new olahAnggotaController();
        Anggota A = this.findAnggota(peminjaman.nipm, aRep);
        Buku B = this.findBuku(peminjaman.isbn, bRep);
        if (verifyPinjam(A) && B.cekStok()){
            A.setTotalPinjam(A.getTotalPinjam()+1);
            B.setStok(B.getStok()-1);
            aRep = aContr.updateAnggota(A.getNIPM(),A.getPassword(),A.getJabatan()
                    ,A.getTotalPinjam(),A.getTglExpire(),A.getDenda(), aRep);
            bRep = bContr.updateBuku(B, bRep);
            System.out.println("Peminjaman berhasil!");
            System.out.println(" ");
            System.out.println("==DATA ANGGOTA==");
            System.out.println(" ");
            for (Anggota aRep1 : aRep) {
                System.out.println("NIP : " + aRep1.getNIPM());
                System.out.println("Jabatan : " + aRep1.getJabatan());
                System.out.println("Total Pinjaman : " + aRep1.getTotalPinjam()+"/n");
                System.out.println(" ");
            }
            
            System.out.println("==DATA BUKU==");
            System.out.println(" ");
             for (Buku bRep1 : bRep) {
                System.out.println("ISBN : " + bRep1.getISBN());
                System.out.println("Judul : " + bRep1.getJudul());
                System.out.println("Stok : " + bRep1.getStok());
                System.out.println(" ");
            }
            //container[0].add(aRep);
            //container[1].add(bRep);
        }
        else {
            System.out.println("Pinjaman lebih atau stok habis!");
        }
    }
    
    
    public Anggota findAnggota(String nipm, List<Anggota> rep){
        Anggota A = new Anggota ("","");
        for (Anggota rep1 : rep) {
            if (rep1.getNIPM().equals(nipm)) {
                A = new Anggota(rep1.getNIPM(), rep1.getPassword(), rep1.getJabatan(), 
                        rep1.getTotalPinjam(), rep1.getTglExpire(), rep1.getDenda());
            }
        }
        return A;
    }
    
    public Buku findBuku(String ISBN, List<Buku> rep)
    {
        Buku A = new Buku("","","","","","",0);
        for (Buku rep1 : rep) {
            if (rep1.getISBN().equals(ISBN)) {
                A = new Buku(rep1.getISBN(), rep1.getJudul(), rep1.getPenerbit(), 
                        rep1.getAuthor(), rep1.getSinopsis(), rep1.getnoRak(), rep1.getStok());
            }
        }
        return A;
    }
    
    public Boolean verifyPinjam (Anggota A){
        return(A.getTotalPinjam() != 2);
    }
}
