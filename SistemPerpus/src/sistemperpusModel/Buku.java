/***********************************************************************
 * Module:  Buku.java
 * Author:  Mira
 * Purpose: Defines the Class Buku
 ***********************************************************************/

package sistemperpusModel;

import java.util.ArrayList;
import java.util.List;
import sistemperpusRepositories.bukuRepository;

public class Buku { //implements ILibrary, IBuku
   private String isbn;
   private String judul;
   private String penerbit;
   private String author;
   private String sinopsis;
   private String noRak;
   private int stok;
   
   bukuRepository repository = new bukuRepository ();
   
   public Buku (String ISBN, String Judul, String Penerbit, String Author, 
           String Sinopsis, String Rak, int Stok) {
        this.isbn = ISBN;
        this.judul = Judul;
        this.penerbit = Penerbit;
        this.author = Author;
        this.sinopsis = Sinopsis;
        this.noRak = Rak;
        this.stok = Stok;
   }//b = string.matches("(?i).*i am.*");
   
   public List<Buku> cariBuku (String keyword){
        List<Buku> list = repository.FindAll();
        List<Buku> result = new ArrayList();
        for (Buku list1 : list) {
            if ((list1.getJudul()).matches("(?i).*"+keyword+"*")) {
                result.add(list1);
            }
        }
        return result;
   }
   
   public String getISBN() {
      return this.isbn;
   }
   
   public String getJudul() {
      return this.judul;
   }
   
   public String getPenerbit() {
      return this.penerbit;
   }
   
   public String getAuthor() {
      return this.author;
   }
   
   public String getSinopsis() {
      return this.sinopsis;
   }
   
   public String getnoRak() {
      return this.noRak;
   }
   
   public int getStok() {
      return this.stok;
   }
   
   public void setISBN(String ISBN) {
      this.isbn = ISBN;
   }
   
   public void setJudul(String Judul) {
      this.judul = Judul;
   }
   
   public void setPenerbit(String Penerbit) {
       this.penerbit = Penerbit;
   }
   
   public void setAuthor(String Author) {
       this.author = Author;
   }
   
   public void setSinopsis(String Sinopsis) {
      this.sinopsis = Sinopsis;
   }
   
   public void setnoRak(String Rak) {
      this.noRak = Rak;
   }
   
   public void setStok(int Stok) {
      this.stok = Stok;
   }
   
   public void addBuku(Buku buku) {
      // TODO: implement
   }
   
   public void updateBuku(Buku buku) {
      // TODO: implement
   }
   
   public void deleteBuku(Buku buku) {
      // TODO: implement
   }
   
   public Boolean cekStok() {
      // TODO: implement
      return null;
   }

}