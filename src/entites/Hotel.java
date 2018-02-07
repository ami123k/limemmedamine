/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author amine
 */
public class Hotel extends  Etablissement{
    
    float prix_nuit;
    float prix_mois;
    String check_in;
    String check_out;
    int chambre_double_dispo;
    int chambre_single_dispo;
    List<Chambre>chambres= new ArrayList<Chambre>();
    

    public float getPrix_nuit() {
        return prix_nuit;
    }

    public void setPrix_nuit(float prix_nuit) {
        this.prix_nuit = prix_nuit;
    }

    public float getPrix_mois() {
        return prix_mois;
    }

    public void setPrix_mois(float prix_mois) {
        this.prix_mois = prix_mois;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public String getCheck_out() {
        return check_out;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }

    public int getChambre_double_dispo() {
        return chambre_double_dispo;
    }

    public void setChambre_double_dispo(int chambre_double_dispo) {
        this.chambre_double_dispo = chambre_double_dispo;
    }

    public int getChambre_single_dispo() {
        return chambre_single_dispo;
    }

    public void setChambre_single_dispo(int chambre_single_dispo) {
        this.chambre_single_dispo = chambre_single_dispo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id_etablissement) {
        this.id = id_etablissement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getHoraire_travail() {
        return horaire_travail;
    }

    public void setHoraire_travail(String horaire_travail) {
        this.horaire_travail = horaire_travail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCodepostal() {
        return code_postal;
    }

    public void setCodepostal(int codepostal) {
        this.code_postal = codepostal;
    }

    public String getCritere() {
        return critere;
    }

    public void setCritere(String critere) {
        this.critere = critere;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public categorie getCat() {
        return cat;
    }

    public void setCat(categorie cat) {
        this.cat = cat;
    }

    public Hotel(float prix_nuit, float prix_mois, String check_in, String check_out, int chambre_double_dispo, int chambre_single_dispo, int id, String nom, String adresse, int telephone, String horaire_travail, String description, int code_postal, String critere, String photo, String positon, categorie cat) {
        super(id, nom, adresse, telephone, horaire_travail, description, code_postal, critere, photo, positon, cat);
        this.prix_nuit = prix_nuit;
        this.prix_mois = prix_mois;
        this.check_in = check_in;
        this.check_out = check_out;
        this.chambre_double_dispo = chambre_double_dispo;
        this.chambre_single_dispo = chambre_single_dispo;
    }

    public Hotel() {
    }

      
    }

  

