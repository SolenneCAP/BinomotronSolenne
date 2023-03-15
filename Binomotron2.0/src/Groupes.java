import java.util.ArrayList;

public class Groupes {
    private int id_groupe;
    private ArrayList<Apprenants> apprenants;

    public Groupes(int id_groupe, ArrayList<Apprenants> apprenants) {
        this.id_groupe = id_groupe;
        this.apprenants = apprenants;
    }

    public int getId_groupe() {
        return id_groupe;
    }

    public ArrayList<Apprenants> getApprenants() {
        return apprenants;
    }
}
