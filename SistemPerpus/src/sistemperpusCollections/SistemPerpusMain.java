/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusCollections;
import java.util.List;
import sistemperpusRepositories.*;
import sistemperpusModel.*;
import sistemperpusController.*;
/**
 *
 * @author Mira
 */
public class SistemPerpusMain {
     public static void main(String[] args) {
        // TODO code application logic here
        /*bukuRepository A = new bukuRepository();
        List<Buku> bukuRep =  A.initData();
        
        anggotaRepository B = new anggotaRepository();
        List<Anggota> anggotaRep =  B.initData();
        */
        searchController controller = new searchController();
        // Start the application
        controller.startApplication();
    }
}
