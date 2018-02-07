/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Config.Connexion;
import Iservice.salondetheinterface;
import Main.Main;
import entites.Etablissement;
import entites.Lounge;
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

/**
 *
 * @author amine
 */
public class salondetheservice implements salondetheinterface {
    public Connection cnx;

    public salondetheservice() {
        this.cnx = Connexion.getInstance().getcon();
    }
   
    
        

   
    public void ajoutersalon(SalonDeThe s) {
         try {
            Statement state = cnx.createStatement();
            state.executeUpdate("INSERT INTO`etablissement`(`nom`,`adresse`,`telephone`,`description`,`code_postal`,`critere`,`photo`,`categorie`,`menu`,`repas_servis`,`position`,`horaire_travail`) VALUES ('"+s.getNom()+"','"+s.getAdresse()+"',"+s.getTelephone()+",'"+s.getDescription()+"',"+s.getCode_postal()+",'"+s.getCritere()+
  "','"+s.getPhoto()+"','"+s.getCat()+"','"+s.getMenu()+"','"+s.getRepas_servis()+"','"+s.getPositon()+"','"+s.getHoraire_travail()+"');");
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }
    public void Editsalon(SalonDeThe s) 
    {
        try
        {
        String update = "UPDATE etablissement SET code_postal= ? WHERE nom = ? and categorie =?";
        PreparedStatement statement2 = cnx.prepareStatement(update);
        statement2.setInt(1,s.getCode_postal());
        statement2.setString(2,s.getNom());
        
        statement2.setString(3,"SalonDeThe");
        statement2.executeUpdate();
        System.out.println("SalonDeThe num"+s.getTelephone()+" modifiÃ©e !!!");
        
        }
        catch (SQLException e)
                {
                    System.out.println(e.getMessage());
                }
    }
    
    
    

    @Override
    public void Deletesalon(SalonDeThe s) 
    {
        try 
        {
        String delete = "DELETE FROM etablissement WHERE nom= ? and categorie=?";
        PreparedStatement st2 = cnx.prepareStatement(delete);
        st2.setString(1,s.getNom());
        st2.setString(2, "SalonDeThe");
        st2.executeUpdate();
       
        
        }
        catch (SQLException e)
        {

                    System.err.println("SQLException: "+e.getMessage());
                           }
    }



  
    public SalonDeThe Findsalon(String nom ,String categorie) 
    {
        SalonDeThe s = new SalonDeThe();
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

  
 
    public List<SalonDeThe> listsalon() 
    {
                List<SalonDeThe> sal=new ArrayList<>();
        try 
        {
        String select = "SELECT Id_etablissement, nom, adresse, telephone, description, code_postal, critere, photo, categorie,menu,repas_servis FROM etablissement where categorie = '"+Etablissement.categorie.SalonDeThe +"';";
        Statement statement1 = cnx.createStatement();
        
        ResultSet result = statement1.executeQuery(select);
        
        while (result.next()) 
        {
            SalonDeThe sa = new SalonDeThe();
            
            sa.setNom(result.getString("nom"));
            sa.setAdresse(result.getString("adresse"));
            sa.setTelephone(result.getInt("Telephone"));
            sa.setDescription(result.getString("description"));
            sa.setCode_postal(result.getInt("code_postal"));
            sa.setCritere(result.getString("critere"));
            sa.setPhoto(result.getString("photo"));
            sa.setRepas_servis(result.getString("repas_servis"));
            
            
            sal.add(sa);

        } 
    }   
        catch (SQLException e)
                {
                    System.err.println("SQLException: "+e.getMessage());
                    System.err.println("SQLSTATE: "+e.getSQLState());
                    System.err.println("VnedorError: "+e.getErrorCode());
                }
        return sal;
}

}
