/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Config.Connexion;
import entites.Etablissement;
import entites.Restaurant;
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
public class Restaurantservice {
      public Connection cnx;

    public Restaurantservice() {
        this.cnx = Connexion.getInstance().getcon();
    }
    
     public void ajouterrestaurant(Restaurant r) {
         try {
            Statement state = cnx.createStatement();
            state.executeUpdate("INSERT INTO`etablissement`(`nom`,`adresse`,`telephone`,`description`,`code_postal`,`critere`,`photo`,`categorie`,`menu`,`repas_servis`,`position`,`horaire_travail`) VALUES ('"+r.getNom()+"','"+r.getAdresse()+"',"+r.getTelephone()+",'"+r.getDescription()+"',"+r.getCode_postal()+",'"+r.getCritere()+
  "','"+r.getPhoto()+"','"+r.getCat()+"','"+r.getMenu()+"','"+r.getRepas_servis()+"','"+r.getPositon()+"','"+r.getHoraire_travail()+"');");
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }
public void Editrestaurant(Restaurant r) 
    {
        try
        {
        String update = "UPDATE etablissement SET code_postal= ? WHERE nom = ? and categorie =?";
        PreparedStatement statement2 = cnx.prepareStatement(update);
        statement2.setInt(1,r.getCode_postal());
        statement2.setString(2,r.getNom());
        
        statement2.setString(3,"restaurant");
        statement2.executeUpdate();
        System.out.println("restaurant num"+r.getTelephone()+" modifiÃ©e !!!");
        
        }
        catch (SQLException e)
                {
                    System.out.println(e.getMessage());
                }
    }
    
    
    public void Deleterestaurant(Restaurant rs) 
    {
        try 
        {
        String delete = "DELETE FROM etablissement WHERE nom= ? and categorie=?";
        PreparedStatement st2 = cnx.prepareStatement(delete);
        st2.setString(1,rs.getNom());
        st2.setString(2, "restaurant");
        st2.executeUpdate();
       
        
        }
        catch (SQLException e)
        {

                    System.err.println("SQLException: "+e.getMessage());
                           }
    }

public Restaurant Findrestaurant(String nom ,String categorie) 
    {
        Restaurant s = new Restaurant();
        try
        {
        String select = "SELECT * FROM etablissement WHERE nom = '"+nom+"' and categorie = '"+categorie+"' ";
        Statement statement1 = cnx.createStatement();
        ResultSet result = statement1.executeQuery(select);
       
        while (result.next()) 
        {
            s.setNom(result.getString("nom"));
            s.setAdresse(result.getString("adresse"));
            s.setCritere(result.getString("critere"));
            s.setDescription(result.getString("description"));
            s.setPhoto(result.getString("photo"));
            s.setMenu(result.getString("menu"));
            s.setRepas_servis(result.getString("repas_servis"));
            
            s.setId(result.getInt("id_etablissement"));
        
        }
        }
        catch (SQLException e)
                {
                    System.err.println("SQLException: "+e.getMessage());
                    System.err.println("SQLSTATE: "+e.getSQLState());
                    System.err.println("VnedorError: "+e.getErrorCode());
                }
        return s;
    }

  
 public List<Restaurant> listrestaurant() 
    {
                List<Restaurant> rest=new ArrayList<>();
        try 
        {
        String select = "SELECT Id_etablissement, nom, adresse, telephone, description, code_postal, critere, photo, categorie,menu,repas_servis FROM etablissement where categorie = '"+Etablissement.categorie.Restaurant +"';";
        Statement statement1 = cnx.createStatement();
        
        ResultSet result = statement1.executeQuery(select);
        
        while (result.next()) 
        {
            Restaurant re = new Restaurant();
            
            re.setNom(result.getString("nom"));
            re.setAdresse(result.getString("adresse"));
            re.setTelephone(result.getInt("Telephone"));
            re.setDescription(result.getString("description"));
            re.setCode_postal(result.getInt("code_postal"));
            re.setCritere(result.getString("critere"));
            re.setPhoto(result.getString("photo"));
            re.setRepas_servis(result.getString("repas_servis"));
            
            
            rest.add(re);

        } 
    }   
        catch (SQLException e)
                {
                    System.err.println("SQLException: "+e.getMessage());
                    System.err.println("SQLSTATE: "+e.getSQLState());
                    System.err.println("VnedorError: "+e.getErrorCode());
                }
        return rest;
}


  
}
