/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusModel;

import java.util.Date;

/**
 *
 * @author Mira
 */
public class Pengembalian {
    
    private Peminjaman peminjaman;
    private Date tglPengembalian;
   
   public Peminjaman getPeminjaman() {      
      return null;
   }

   public Date getTglPeminjaman() {      
      return this.tglPengembalian;
   }
   
   public void setPeminjaman() {
       
   }
   
   public void setTglPengembalian(Date Kembali) {
        this.tglPengembalian = Kembali;
   }

   public int hitungDenda() {
      
      return 0;
   }
}
