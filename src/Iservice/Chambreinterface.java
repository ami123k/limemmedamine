/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iservice;

import entites.Chambre;
import entites.Restaurant;
import java.util.List;

/**
 *
 * @author amine
 */
public interface Chambreinterface {

     
            public void ajouterchambre(Chambre c) ;
            public void Editchambre(Chambre c) ;
            public Chambre Findchambre(String id_ch ,String nomhotel) ;
                public void Deletechambre(Chambre s) ;
                


    
}
    


