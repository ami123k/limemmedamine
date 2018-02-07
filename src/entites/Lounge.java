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
public class Lounge extends Etablissement{
    
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

    public Lounge(String menu, String repas_servis, int id, String nom, String adresse, int telephone, String horaire_travail, String description, int code_postal, String critere, String photo, String positon, categorie cat) {
        super(id, nom, adresse, telephone, horaire_travail, description, code_postal, critere, photo, positon, cat);
        this.menu = menu;
        this.repas_servis = repas_servis;
    }

   

   

    public Lounge() {
    }

    
  

}
