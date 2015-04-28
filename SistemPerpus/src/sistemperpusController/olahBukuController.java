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
    
    public List<Buku> initData(){
        return A.cariBuku("");
    }
    
    public List<Buku> addBuku (String ISBN, String Judul, String Penerbit, String Author, 
           String Sinopsis, String Rak, int Stok, List<Buku> rep){
        Buku B = new Buku (ISBN, Judul, Penerbit, Author, Sinopsis, Rak, Stok);
        rep.add(B);
        return rep;
    }
    
    public List<Buku> deleteBuku (String ISBN, List<Buku> rep){
        for(int i=0; i<rep.size(); i++){
            if(rep.get(i).getISBN().equals(ISBN))
                rep.remove(i);
        }
        return rep;
    }
    
    public List<Buku> updateBuku (Buku temp, List<Buku> rep){
        
        int index = 0; int i = 0;
        while(!rep.get(i).getISBN().equals(temp.getISBN())){
                i++;
        }
        index = i;
        rep.get(index).setJudul(temp.getJudul());
        rep.get(index).setPenerbit(temp.getPenerbit());
        rep.get(index).setAuthor(temp.getAuthor());
        rep.get(index).setSinopsis(temp.getSinopsis());
        rep.get(index).setnoRak(temp.getnoRak());
        rep.get(index).setStok(temp.getStok());
        
        return rep;
    }
    
}
