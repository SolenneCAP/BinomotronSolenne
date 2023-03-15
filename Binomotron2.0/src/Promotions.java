import java.util.Date;

public class Promotions {

    protected int id_promotion;
    protected String nom_promotion;
    protected Date date_demarrage;

    public Promotions(int id_promotion, String nom_promotion, Date date_demarrage) {
        this.id_promotion = id_promotion;
        this.nom_promotion = nom_promotion;
        this.date_demarrage = date_demarrage;
    }

    public int getId_promotion() {

        return id_promotion;
    }

    public String getNom_promotion() {

        return nom_promotion;
    }

    public Date getDate_demarrage() {
        return date_demarrage;
    }

    public void setNom_promotion(String nom_promotion) {
        this.nom_promotion = nom_promotion;
    }

}


