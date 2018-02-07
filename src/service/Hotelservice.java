/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Config.Connexion;
import entites.Etablissement;
import entites.Hotel;
import entites.SalonDeThe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amine
 */
public class Hotelservice {
    public Connection cnx;

    public Hotelservice() {
        this.cnx = Connexion.getInstance().getcon();
    }
    
    public void ajouterhotel(Hotel h)
    {
         try {
            Statement state = cnx.createStatement();
            state.executeUpdate("INSERT INTO`etablissement`(`nom`,`adresse`,`telephone`,`description`,`code_postal`,`critere`,`photo`,`categorie`,`position`,`horaire_travail`,`prix_nuit`,`prix_mois`,`check_in`,`check_out`,`chambre_double_dispo`,`chambre_single_dispo`) VALUES ('"+h.getNom()+"','"+h.getAdresse()+"',"+h.getTelephone()+",'"+h.getDescription()+"',"+h.getCode_postal()+",'"+h.getCritere()+
  "','"+h.getPhoto()+"','"+h.getCat()+"','"+h.getPositon()+"','"+h.getHoraire_travail()+"','"+h.getPrix_nuit()+"','"+h.getPrix_mois()+"','"+h.getCheck_in()+"','"+h.getCheck_out()+"','"+h.getChambre_double_dispo()+"','"+h.getChambre_single_dispo()+"');");
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }

 public void Edithotel(Hotel s) 
    {
        try
        {
        String update = "UPDATE etablissement SET nom= ? WHERE id_etablissement = ? and categorie =?";
        PreparedStatement statement2 = cnx.prepareStatement(update);
        statement2.setString(1, s.getNom());
        statement2.setInt(2,s.getId());
        statement2.setString(3,"hotel");
        statement2.executeUpdate();
        System.out.println("hotel num"+s.getTelephone()+" modifiÃ©e !!!");
        
        }
        catch (SQLException e)
                {
                    System.out.println(e.getMessage());
                }
    }
    
    
    

    public void Deletehotel(Hotel s) 
    {
        try 
        {
        String delete = "DELETE FROM etablissement WHERE nom= ? and categorie=?";
        PreparedStatement st2 = cnx.prepareStatement(delete);
        st2.setString(1,s.getNom());
        st2.setString(2, "hotel");
        st2.executeUpdate();
       
        
        }
        catch (SQLException e)
        {

                    System.err.println("SQLException: "+e.getMessage());
                           }
    }


 public Hotel Findhotel(String nom ,String categorie) 
    {
        Hotel h = new Hotel();
        try
        {
        String select = "SELECT * FROM etablissement WHERE nom = '"+nom+"' and categorie = '"+categorie+"' ";
        Statement statement1 = cnx.createStatement();
        ResultSet result = statement1.executeQuery(select);
       
        while (result.next()) 
        {
            h.setNom(result.getString("nom"));
            h.setAdresse(result.getString("adresse"));
            h.setCritere(result.getString("critere"));
            h.setDescription(result.getString("description"));
            h.setPhoto(result.getString("photo"));
            h.setPrix_mois(result.getFloat("prix_mois"));
            h.setPrix_nuit(result.getFloat("prix_nuit"));
            h.setChambre_double_dispo(result.getInt("Chambre_double_dispo"));
            h.setChambre_single_dispo(result.getInt("Chambre_single_dispo"));
            h.setId(result.getInt("id_etablissement"));
        
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
public List<Hotel> listhotel() 
    {
                List<Hotel> ht=new ArrayList<>();
        try 
        {
        String select = "SELECT Id_etablissement, nom, adresse, telephone, description, code_postal, critere, photo, categorie,prix_nuit,prix_mois,check_in,check_out,chambre_double_dispo,chambre_single_dispo FROM etablissement where categorie = '"+Etablissement.categorie.Hotel +"';";
        Statement statement1 = cnx.createStatement();
        
        ResultSet result = statement1.executeQuery(select);
        
        while (result.next()) 
        {
            Hotel h1 = new Hotel();
            
            h1.setNom(result.getString("nom"));
            h1.setAdresse(result.getString("adresse"));
            h1.setTelephone(result.getInt("Telephone"));
            h1.setDescription(result.getString("description"));
            h1.setCode_postal(result.getInt("code_postal"));
            h1.setCritere(result.getString("critere"));
            h1.setPhoto(result.getString("photo"));
            h1.setPrix_mois(result.getFloat("prix_mois"));
            h1.setPrix_nuit(result.getFloat("prix_nuit"));
            h1.setChambre_double_dispo(result.getInt("Chambre_double_dispo"));
            h1.setChambre_single_dispo(result.getInt("Chambre_single_dispo"));
        
            
            ht.add(h1);

        } 
    }   
        catch (SQLException e)
                {
                    System.err.println("SQLException: "+e.getMessage());
                    System.err.println("SQLSTATE: "+e.getSQLState());
                    System.err.println("VnedorError: "+e.getErrorCode());
                }
        return ht;
}

  
}
