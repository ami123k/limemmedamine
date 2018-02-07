/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amine
 */
public class Connexion {
    private String url="jdbc:mysql://localhost:3306/BonPlan";
    private String login="root";
    private String pwd="";
    private Connection con;
    private  static Connexion instance=null;
    public Connexion() {
        
        try {
            con= DriverManager.getConnection(url,login,pwd);
            System.out.println("ok");
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
          
           
    



    }
public  static Connexion getInstance(){

if (instance ==null ){

instance= new Connexion();

}
 return  instance;
}

public Connection getcon(){
return  con;
}
}
