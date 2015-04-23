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
public class searchController {
    public void startApplication(){
        searchView view = new searchView();
        view.setVisible(true);
    }
    
    public List<String> cariBuku(String keyword){
        List <String> result = new ArrayList<>();
        Buku A = new Buku ("","","","","","",0);
        List <Buku> temp =  A.cariBuku(keyword);
        for (Buku temp1 : temp) {
            result.add(temp1.getJudul());
        }
        return result;
    }
}
