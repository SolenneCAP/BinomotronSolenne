import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionData {

    // Code pour récupérer la liste des projets depuis la base de données
    // et la retourner sous forme de liste d'objets Projet
    public ArrayList<Projets> consulterListeProjets() {
        ArrayList<Projets> projets = new ArrayList<>();

        try {
            Statement requete = DataAccess.getInstance().createStatement();
            String sql = "SELECT * FROM projets";
            ResultSet lecture = requete.executeQuery(sql);

            while (lecture.next()) {
                Projets projetLue = new Projets(lecture.getInt("id_projet"),
                        lecture.getString("nom_projet"),
                        lecture.getInt("id_professeur"));
                projets.add(projetLue);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DataAccess.close();
        }

        return projets;
    }

    public static int creerGroupe() {
        Scanner sc = new Scanner(System.in);
        int nbApprenantsParGroupe = 0;
        do {
            System.out.print("Indiquez combien d'apprenants il faut pour créer un groupe :  ");
            try {
                nbApprenantsParGroupe = Integer.valueOf(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Saisie incorrecte.");
            }
            if (nbApprenantsParGroupe < 2 ) {
                System.out.println("Saisie incorrecte.");
                nbApprenantsParGroupe = 0;
            }
        } while (nbApprenantsParGroupe == 0);
        return nbApprenantsParGroupe;
    }

}