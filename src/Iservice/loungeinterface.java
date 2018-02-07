/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iservice;

import entites.Lounge;
import entites.SalonDeThe;
import java.util.List;

/**
 *
 * @author amine
 */
public interface loungeinterface {
    public void ajouterlounge(Lounge s) ;
        public void Editloung(Lounge s);
            
            public void Deletelounge(Lounge s);
                public Lounge Findloung(String nom ,String categorie);
                public List<Lounge> listloung();



    
}
