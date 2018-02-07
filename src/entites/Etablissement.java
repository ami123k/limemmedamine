/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

import javax.print.attribute.standard.DateTimeAtCompleted;

/**
 *
 * @author amine
 */
public class Etablissement {
    protected int id ;
   protected  String nom;
   protected  String adresse;
   protected  int telephone;
   protected  String horaire_travail;
   protected  String description;
   protected  int code_postal;
   protected  String critere;
   protected  String photo;
   public enum categorie{Hotel,Restaurant,Gym,SalonDeThe,Cinema,FastFood,Creperie,Gelaterie,Lounge};
 protected  String position;
protected  categorie cat ;
    public int getId() {
        return id;
    }

    public void setId(int id_etablissement) {
        this.id = id;
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

    public int getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(int codepostal) {
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

    public String getPositon() {
        return position;
    }

    public void setPositon(String positon) {
        this.position = positon;
    }

    public categorie getCat() {
        return cat;
    }

    public void setCat(categorie cat) {
        this.cat = cat;
    }

    public Etablissement(int id, String nom, String adresse, int telephone, String horaire_travail, String description, int code_postal, String critere, String photo, String positon, categorie cat) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.horaire_travail = horaire_travail;
        this.description = description;
        this.code_postal = code_postal;
        this.critere = critere;
        this.photo = photo;
        this.position = positon;
        this.cat = cat;
    }

   
    public Etablissement() {
    }

    @Override
    public String toString() {
        return "Etablissement{" + "id_etablissement=" + id + ", nom=" + nom + ", adresse=" + adresse + ", telephone=" + telephone + ", horaire_travail=" + horaire_travail + ", description=" + description + ", codepostal=" + code_postal + ", critere=" + critere + ", photo=" + photo + ", positon=" + position + ", cat=" + cat + '}';
    }

    
}