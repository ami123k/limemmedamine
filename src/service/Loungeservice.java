/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Config.Connexion;
import Iservice.loungeinterface;
import Iservice.salondetheinterface;
import entites.Etablissement;
import entites.Lounge;
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
public class Loungeservice implements loungeinterface{
     public Connection cnx;

    public Loungeservice() {
        this.cnx = Connexion.getInstance().getcon();
    }
    
    public void ajouterlounge(Lounge s) {
         try {
            Statement state = cnx.createStatement();
            state.executeUpdate("INSERT INTO`etablissement`(`nom`,`adresse`,`telephone`,`description`,`code_postal`,`critere`,`photo`,`categorie`,`menu`,`repas_servis`,`position`,`horaire_travail`) VALUES ('"+s.getNom()+"','"+s.getAdresse()+"',"+s.getTelephone()+",'"+s.getDescription()+"',"+s.getCode_postal()+",'"+s.getCritere()+
  "','"+s.getPhoto()+"','"+s.getCat()+"','"+s.getMenu()+"','"+s.getRepas_servis()+"','"+s.getPositon()+"','"+s.getHoraire_travail()+"');");
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }
    
    public void Editloung(Lounge s) 
    {
        try
        {
        String update = "UPDATE etablissement SET code_postal= ? WHERE nom = ? and categorie =?";
        PreparedStatement statement2 = cnx.prepareStatement(update);
        statement2.setInt(1,s.getCode_postal());
        statement2.setString(2, s.getNom());
        statement2.setString(3,"lounge");
        statement2.executeUpdate();
        System.out.println("lounge "+s.getTelephone()+" modifiÃ©e !!!");
        
        }
        catch (SQLException e)
                {
                    System.out.println(e.getMessage());
                }
    }
    
    
    
    public void Deletelounge(Lounge s) 
    {
        try 
        {
        String delete = "DELETE FROM etablissement WHERE nom= ? and categorie=?";
        PreparedStatement st2 = cnx.prepareStatement(delete);
        st2.setString(1,s.getNom());
        st2.setString(2, "lounge");
        st2.executeUpdate();
       
        
        }
        catch (SQLException e)
        {

                    System.err.println("SQLException: "+e.getMessage());
                           }
    }



  
    public Lounge Findloung(String nom ,String categorie) 
    {
        Lounge s = new Lounge();
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
            
            s.setId(result.getInt(15));
        
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

  
 
    public List<Lounge> listloung() 
    {
                List<Lounge> lou =new ArrayList<>();
        try 
        {
        String select = "SELECT Id_etablissement, nom, adresse, telephone, description, code_postal, critere, photo, categorie,menu,repas_servis FROM etablissement where categorie = '"+Etablissement.categorie.Lounge +"';";
        Statement statement1 = cnx.createStatement();
        
        ResultSet result = statement1.executeQuery(select);
        
        while (result.next()) 
        {
            Lounge sa = new Lounge();
            
            sa.setNom(result.getString("nom"));
            sa.setAdresse(result.getString("adresse"));
            sa.setTelephone(result.getInt("Telephone"));
            sa.setDescription(result.getString("description"));
            sa.setCode_postal(result.getInt("code_postal"));
            sa.setCritere(result.getString("critere"));
            sa.setPhoto(result.getString("photo"));
            sa.setRepas_servis(result.getString("repas_servis"));
            
            
            lou.add(sa);

        } 
    }   
        catch (SQLException e)
                {
                    System.err.println("SQLException: "+e.getMessage());
                    System.err.println("SQLSTATE: "+e.getSQLState());
                    System.err.println("VnedorError: "+e.getErrorCode());
                }
        return lou;
}

   
   
    
}
