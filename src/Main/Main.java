/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import entites.Chambre;
import entites.Etablissement;
import entites.Hotel;
import entites.Lounge;
import entites.Restaurant;
import service.salondetheservice;
import entites.SalonDeThe;
import service.Chambreservice;
import service.Hotelservice;
import service.Loungeservice;
import service.Restaurantservice;

/**
 *
 * @author amine
 */
public class Main extends  Etablissement{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        salondetheservice sa = new salondetheservice();
       SalonDeThe st1 = new SalonDeThe("salad", "repas_servis", 155, "ahmed", "amin@esprit", 4, "155", "description", 10000, "critere"," photo", "positon",Etablissement.categorie.SalonDeThe );
        
              st1.setCode_postal(5);
        st1.setNom("amin"); 
         // sa.ajoutersalon(st1);
          //  sa.Editsalon(st1);
            //sa.Deletesalon(st1);
            //System.out.println(sa.Findsalon("amin","SalonDeThe"));
            //for (SalonDeThe arg : sa.listsalon()) {
             // System.out.println(arg.toString());}
            //*****************************************************************
        
            Loungeservice ls=new  Loungeservice();
        
         Lounge l = new Lounge("kouskous", "adsq", 15, "aminee", "amiune@gmail", 15, "15.548", "salut", 888, "llsksk", "url", "1547.5444", Etablissement.categorie.Lounge);
    
    //ls.ajouterlounge(l);
    //ls.Editloung(l);
    //ls.Deletelounge(l);
    //ls.Findloung("aminee", "lounge");
  // for(Lounge li :ls.listloung()){
  //System.out.println(li.toString());    }

   
      Hotelservice hs=new Hotelservice();
        Hotel h=new Hotel(54, 6, "ss", "le18", 12, 13, 18, "cinema1", "add", 877, "15.54", "hii", 4588, "5etoile", "url", "15.766", Etablissement.categorie.Hotel);
//h.setId(17);
//h.setNom("amineelimem");
 hs.ajouterhotel(h);
   // hs.Deletehotel(h);
   //hs.Edithotel(h);
   //System.out.println(hs.Findhotel("limem", "hotel"));
 // for(Hotel h1 :hs.listhotel()){
     // System.out.println(h1.toString());
  
       Chambreservice cs = new  Chambreservice();
        Chambre c = new Chambre(5, "double", 152, "rosabeach");
   c.setNomhotel("cinema1");
   c.setId_ch(2);
        c.setPrix(500000);
       cs.ajouterchambre(c);
    //cs.Editchambre(c);
    //for(Chambre ch:cs.listchambre()){
    // System.out.println(c.toString());}
Restaurantservice rs = new  Restaurantservice();
        Restaurant r = new Restaurant("salad", "repas_servis", 155, "ahmed", "amin@esprit", 4, "155", "description", 10000, "critere"," photo", "positon",Etablissement.categorie.Restaurant);
 r.setCode_postal(5025);
 r.setNom("ahmed");
rs.ajouterrestaurant(r);
  //rs.Editrestaurant(r);
    
  // System.out.println(rs.Findrestaurant("ahmed", "restaurant"));
  
   // for(Restaurant ch:rs.listrestaurant()){
    // System.out.println(ch.toString());}
    
    }

}
    
    
    


    
    
    

