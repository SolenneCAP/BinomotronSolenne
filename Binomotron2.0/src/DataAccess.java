import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAccess {

    private static Connection connexion;
    private String url = "jdbc:mysql://localhost:3306/binomotron_solenne";
    private String login = "root";
    private String mdp = "root";

    static {
        try {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
        } catch (ClassNotFoundException e) {
            throw new RuntimeException( e );
        }
    }

    public DataAccess() {

    }

    public static Connection getInstance() {

        if (connexion == null) {
            try {
                connexion = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/Binomotron201", "root", "root" );

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connexion;
    }

    public static void close() {
        try {
            connexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        connexion = null;
    }
}

