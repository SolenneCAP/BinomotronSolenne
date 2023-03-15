import java.util.Objects;

public class Apprenants extends Administrateurs {

    private int id_apprenant;
    private String nom_apprenant;
    private String prenom_apprenant;
    private String mail_apprenant;
    private String mdp_apprenant;
    private int id_promotion;


    public Apprenants(int id_apprenant, String nom_apprenant, String prenom_apprenant,
                      String mail_apprenant, String mdp_apprenant, int id_promotion,
                      int id_role) {
        super();
        this.id_apprenant = id_apprenant;
        this.nom_apprenant = nom_apprenant;
        this.prenom_apprenant = prenom_apprenant;
        this.mail_apprenant = mail_apprenant;
        this.mdp_apprenant = mdp_apprenant;
        this.id_promotion = id_promotion;

    }

    public int getId_apprenant() {
        return id_apprenant;
    }

    public String getNom_apprenant() {
        return nom_apprenant;
    }

    public String getPrenom_apprenant() {
        return prenom_apprenant;
    }

    public String getMail_apprenant() {
        return mail_apprenant;
    }

    public int getId_promotion() {
        return id_promotion;
    }

    public void setId_apprenant(int id_apprenant) {
        this.id_apprenant = id_apprenant;
    }

    public String getMdp_apprenant() {
        return mdp_apprenant;
    }

    public void setMdp_apprenant(String mdp_apprenant) {
        this.mdp_apprenant = mdp_apprenant;
    }

    public void setId_promotion(int id_promotion) {
        this.id_promotion = id_promotion;
    }



    public void setNom_apprenant(String nom_apprenant) {
        this.nom_apprenant = nom_apprenant;
    }

    public void setPrenom_apprenant(String prenom_apprenant) {
        this.prenom_apprenant = prenom_apprenant;
    }

    public void setMail_apprenant(String mail_apprenant) {
        this.mail_apprenant = mail_apprenant;
    }


    public boolean verifierIdentite(int id_apprenant, String mdp_apprenant) {
        return Objects.equals( this.id_apprenant, id_apprenant ) && this.mdp_apprenant.equals(mdp_apprenant);
    }
}

