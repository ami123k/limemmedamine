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
public class Chambre {
    protected int id ;
    protected int id_ch;
   protected String type;
     protected float prix;
   protected String nomhotel; 

    public Chambre(int id, String type, float prix, String nomhotel) {
        this.id = id;
       // this.id_ch = id_ch;
        this.type = type;
        this.prix = prix;
        this.nomhotel = nomhotel;
    }

    public Chambre() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_ch() {
        return id_ch;
    }

    public void setId_ch(int id_ch) {
        this.id_ch = id_ch;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getNomhotel() {
        return nomhotel;
    }

    public void setNomhotel(String nomhotel) {
        this.nomhotel = nomhotel;
    }

    @Override
    public String toString() {
        return "Chambre{" + "id=" + id + ", id_ch=" + id_ch + ", type=" + type + ", prix=" + prix + ", nomhotel=" + nomhotel + '}';
    }

    

}
