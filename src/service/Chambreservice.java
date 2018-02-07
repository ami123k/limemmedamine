/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Config.Connexion;
import entites.Chambre;
import entites.Etablissement;
import entites.Hotel;
import entites.Restaurant;
import entites.SalonDeThe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.KeyCode;

/**
 *
 * @author amine
 */
public class Chambreservice {
    
     public Connection cnx;

    public Chambreservice() {
        this.cnx = Connexion.getInstance().getcon();
    }
  
   public void ajouterchambre(Chambre c)    {
      
            try {
               String sql = "SELECT * from etablissement where categorie = 'Hotel' ;";
                //System.out.println(se);
        Statement statement1 = cnx.createStatement();
        ResultSet result = statement1.executeQuery(sql);
        while (result.next()) 
        {
            c.setNomhotel(result.getString("nom"));
        }
            Statement state = cnx.createStatement();
             state.executeUpdate("INSERT INTO`chambre`(`type`,`prix`,`nom_hotel`,`id_etablissement`) VALUES ('"+c.getType()+"',"+c.getPrix()+",'"+c.getNomhotel()+"','"+c.getId()+"');");
             // 
         } catch (SQLException ex) {
               System.out.println(ex.getMessage());    
         }
        
        }
    
public void Editchambre(Chambre c) 
    {
        try
        {
        String update = "UPDATE chambre SET prix= ? WHERE id_ch = ? and nom_hotel =?";
        PreparedStatement statement2 = cnx.prepareStatement(update);
        statement2.setFloat(1,c.getPrix());
        statement2.setInt(2,c.getId_ch());
        
        statement2.setString(3,c.getNomhotel());
        statement2.executeUpdate();
        System.out.println("chambre num"+c.getId_ch()+" modifiÃ©e !!!");
        
        }
        catch (SQLException e)
                {
                    System.out.println(e.getMessage());
                }
    }
    
    

    public void Deletechambre(Chambre s) 
    {
        try 
        {
        String delete = "DELETE FROM chambre WHERE id_ch = ? and nom_hotel =?";
        PreparedStatement st2 = cnx.prepareStatement(delete);
        st2.setInt(1,s.getId_ch());
        st2.setString(2, s.getNomhotel());
        st2.executeUpdate();
       
        
        }
        catch (SQLException e)
        {

                    System.err.println("SQLException: "+e.getMessage());
                           }
    }

public Chambre Findchambre(String id_ch ,String nomhotel) 
    {
        Chambre h = new Chambre();
        try
        {
        String select = "SELECT * FROM etablissement WHERE id_ch = '"+id_ch+"' and nom_hotel = '"+nomhotel+"' ";
        Statement statement1 = cnx.createStatement();
        ResultSet result = statement1.executeQuery(select);
       
        while (result.next()) 
        {
            h.setId_ch(result.getInt("id_ch"));
            h.setNomhotel(result.getString("nom_hotel"));
            h.setId(result.getInt("Id_etablissement"));
            h.setPrix(result.getInt("Prix"));
            h.setType(result.getString("type"));
        }
        }
        catch (SQLException e)
                {
                    System.err.println("SQLException: "+e.getMessage());
                    System.err.println("SQLSTATE: "+e.getSQLState());
                    System.err.println("VnedorError: "+e.getErrorCode());
                }
        return h;
    }

 public List<Chambre> listchambre() 
    {
                List<Chambre> cha=new ArrayList<>();
        try 
        {
        String select = "SELECT * FROM chambre;";
        Statement statement1 = cnx.createStatement();
        
        ResultSet result = statement1.executeQuery(select);
        
        while (result.next()) 
        {
            Chambre sa = new Chambre();
            
            sa.setId_ch(result.getInt("id_ch"));
            sa.setNomhotel(result.getString("nom_hotel"));
            sa.setId(result.getInt("id_etablissement"));
            sa.setPrix(result.getInt("prix"));
            sa.setType(result.getString("type"));
            
            
            cha.add(sa);

        } 
    }   
        catch (SQLException e)
                {
                    System.err.println("SQLException: "+e.getMessage());
                    System.err.println("SQLSTATE: "+e.getSQLState());
                    System.err.println("VnedorError: "+e.getErrorCode());
                }
        return cha;
}


}
    
   
    
    

