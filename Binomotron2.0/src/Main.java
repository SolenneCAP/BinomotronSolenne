import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       DataAccess dataAccess = new DataAccess();
       DataAccess.getInstance();

        GestionData gestionData = new GestionData();
        ArrayList<Projets> projets = gestionData.consulterListeProjets();
        GestionData.creerGroupe();
    }
}