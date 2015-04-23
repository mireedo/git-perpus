/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusController;
import javax.swing.JOptionPane;
import sistemperpusModel.*;
import sistemperpusView.*;
/**
 *
 * @author Mira
 */
public class loginController {
    public void openLogin(){
        loginView view = new loginView();
        view.setVisible(true);
    }
    
    public Boolean login (String NIPM, String passwd){
        System.out.println("Masuk fungsi login controller");
        Anggota A = new Anggota(NIPM, passwd);
        if(A.Login(NIPM, passwd)){
            JOptionPane.showMessageDialog(null,"Login Berhasil!");
            return true;
        }
        else {
            JOptionPane.showMessageDialog(null,"Login Gagal!");
            return false;
        }  
    }
}
