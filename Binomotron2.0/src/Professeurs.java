import java.util.ArrayList;

public class Professeurs {
    private int id_professeur;


    private String nom_professeur;
    private String prenom_professeur;
    private ArrayList<Projets> projets;

    public Professeurs(String nom_professeur, String prenom_professeur) {
        this.id_professeur = id_professeur;
        this.nom_professeur = nom_professeur;
        this.prenom_professeur = prenom_professeur;
        this.projets = new ArrayList<>();
    }

    public String getNom_professeur() {
        return nom_professeur;
    }

    public void setNom_professeur(String nom_professeur) {
        this.nom_professeur = nom_professeur;
    }

    public String getPrenom_professeur() {
        return prenom_professeur;
    }

    public void setPrenom_professeur(String prenom_professeur) {
        this.prenom_professeur = prenom_professeur;
    }

    public ArrayList<Projets> getProjets() {
        return projets;
    }

    public void setProjets(ArrayList<Projets> projets) {
        this.projets = projets;
    }


    public void ajouterProjet(Projets projet) {
        projets.add( projet );
    }
}


   /*

    public void afficherListeProjets() {
        System.out.println("Liste des projets :");
        for (Projets projet : projets) {
            System.out.println(projet.getId_projet() + " - " + projet.getNom_projet() + " (" + projet.getCreateur() + ")");
        }
    }

    public boolean verifierIdentite(int id_p, String mdp_admin) {
        return Objects.equals( this.id_admin, id_admin ) && this.mdp_admin.equals(mdp_admin);


    public void creerGroupe(Projets projet, Promotions promotion, int nbApprenantsParGroupe) {
        /    Vérifier que la saisie est correcte
        if (nbApprenantsParGroupe < 2 || promotion == null || projet == null) {
            System.out.println("Saisie incorrecte.");
            return;
        }

        /     Constituer les groupes aléatoirement
        ArrayList<Apprenants> apprenants = new ArrayList<>();
        /    ... code pour récupérer les apprenants de la promotion et les mélanger aléatoirement ...
        ArrayList<Groupes> groupes = new ArrayList<>();
        for (int i =

    */
