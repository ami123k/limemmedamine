/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iservice;

import entites.SalonDeThe;
import java.util.List;

/**
 *
 * @author amine
 */
public interface salondetheinterface {
 public void ajoutersalon(SalonDeThe s);   
public void Editsalon(SalonDeThe s) ;
 public void Deletesalon(SalonDeThe s);
 public SalonDeThe Findsalon(String nom ,String categorie); 
 public List<SalonDeThe> listsalon();
 
 
}
 