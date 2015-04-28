/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusController;
import java.util.ArrayList;
import java.util.List;
import sistemperpusModel.*;
import sistemperpusView.*;
/**
 *
 * @author Mira
 */
public class peminjamanController {
    Peminjaman P = new Peminjaman();
    
    public void openBuku (){
        peminjamanView view = new peminjamanView();
        view.setVisible(true);
    }
    
    public List<Peminjaman> initData(){
        return P.getAll();
    }
    
    public void pinjam (Buku A){
        
    }
}
