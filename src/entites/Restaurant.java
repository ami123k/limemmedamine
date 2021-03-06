/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author amine
 */
public class Restaurant extends Etablissement{
   
     protected  String menu;
    protected String repas_servis;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getRepas_servis() {
        return repas_servis;
    }

    public void setRepas_servis(String repas_servis) {
        this.repas_servis = repas_servis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public void setCode_postal(int code_postal) {
        this.code_postal = code_postal;
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

    public Restaurant(String menu, String repas_servis, int id, String nom, String adresse, int telephone, String horaire_travail, String description, int code_postal, String critere, String photo, String positon, categorie cat) {
        super(id, nom, adresse, telephone, horaire_travail, description, code_postal, critere, photo, positon, cat);
        this.menu = menu;
        this.repas_servis = repas_servis;
    }
    

    

    @Override
    public String toString() {
        return super.toString()+"Restaurant{" + "menu=" + menu + ", repas_servis=" + repas_servis + '}';
    }

    public Restaurant() {
    }

}
