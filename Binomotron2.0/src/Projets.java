public class Projets {
    private int id_projet;
    private String nom_projet;
    private int createur;


    public Projets(Object newView1, String nomProjet, int createur) {
        this.id_projet = id_projet;
        this.nom_projet = nom_projet;
        this.createur = this.createur;
    }

    public int getId_projet() {
        return id_projet;
    }

    public String getNom_projet() {
        return nom_projet;
    }

    public int getCreateur() {
        return createur;
    }

    public void setNom_projet(String nom_projet) {
        this.nom_projet = nom_projet;
    }

    public void setCreateur(int createur) {
        this.createur = createur;
    }
}
