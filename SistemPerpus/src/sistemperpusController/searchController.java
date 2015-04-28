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
public class searchController {
    public searchController (List<Buku> buku, List<Anggota> anggota){ 
    }
    
    public searchController (){
        
    }

    public void startApplication(){
        searchView view = new searchView();
        view.setVisible(true);
    }
    
    public List<Buku> cariBuku(String keyword){
        Buku A = new Buku ("","","","","","",0);
        return A.cariBuku(keyword);
    }
}
