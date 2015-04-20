/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusModel;

/**
 *
 * @author Mira
 */
public class Login {
    private String username;
    private String password;
    public int attempt;
    
    public Login(String user, String passwd)
    {
        this.username = user;
        this.password = passwd;
        this.attempt = 0;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public String getPassword() {
        return this.username;
    }
    
    public void setUsername (String user){
        this.username=user;
    }
    
    public void setPassword (String passwd){
        this.password=passwd;
    }
    
    public Boolean Login (String user, String passwd, int attemp)
    {
        if (attemp < 4)
        {
            if (user.equals(this.username) && (passwd.equals(this.password)))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            attemp = attemp + 1;
            return false;
        }
    }
}
