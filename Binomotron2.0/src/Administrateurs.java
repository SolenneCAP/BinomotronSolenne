import java.util.Objects;

public class Administrateurs {

    private String nom_admin;
    private String prenom_admin;
    private int id_admin;
    private String mdp_admin;
    private String mail_admin;

    public Administrateurs() {
        this.nom_admin = nom_admin;
        this.prenom_admin = prenom_admin;
        this.id_admin = id_admin;
        this.mdp_admin = mdp_admin;
        this.mail_admin = mail_admin;
    }

    public String getNom_admin() {
        return nom_admin;
    }

    public void setNom_admin(String nom_admin) {
        this.nom_admin = nom_admin;
    }

    public String getPrenom_admin() {
        return prenom_admin;
    }

    public void setPrenom_admin(String prenom_admin) {
        this.prenom_admin = prenom_admin;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getMdp_admin() {
        return mdp_admin;
    }

    public void setMdp_admin(String mdp_admin) {
        this.mdp_admin = mdp_admin;
    }

    public String getMail_admin() {
        return mail_admin;
    }

    public void setMail_admin(String mail_admin) {
        this.mail_admin = mail_admin;
    }

    public boolean verifierIdentite(String id_admin, String mdp_admin) {
        return Objects.equals( this.id_admin, id_admin ) && this.mdp_admin.equals( mdp_admin );
    }
}

