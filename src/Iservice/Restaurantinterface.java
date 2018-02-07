/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iservice;

import entites.Restaurant;
import java.util.List;

/**
 *
 * @author amine
 */
public interface Restaurantinterface {
     public void ajouterrestaurant(Restaurant r);
    public void Editrestaurant(Restaurant r);
    public List<Restaurant> listrestaurant();
}
