/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iservice;

import entites.Hotel;
import entites.SalonDeThe;

/**
 *
 * @author amine
 */
public interface Hotelinterface {
        public void ajouterhotel(Hotel h);
         public void Edithotel(Hotel s);
             public void Deletehotel(Hotel s) ;
                 public Hotel Findhotel(String nom ,String categorie) ;




    
}
