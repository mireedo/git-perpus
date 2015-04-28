/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusController;
import java.util.List;
import sistemperpusModel.*;
import sistemperpusView.*;
/**
 *
 * @author Mira
 */
public class olahBukuController {

    Buku A = new Buku("","","","","","",0);
    
    public void openBuku (){
        olahBukuView view = new olahBukuView();
        view.setVisible(true);
    }
    
    public void addBuku (String ISBN, String Judul, String Penerbit, String Author, 
           String Sinopsis, String Rak, int Stok){
        Buku B = new Buku (ISBN, Judul, Penerbit, Author, Sinopsis, Rak, Stok);
        B.addBuku(B);
    }
}
