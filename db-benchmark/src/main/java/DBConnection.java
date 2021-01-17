import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class used for connection
 * @author luca
 *
 */
public class DBConnection {

    private final String serverName = "localhost:3306";
    private final String myDatabase = "diennea";
    private final String user = "root";
    private final String password = "";						                //password
    private final String url = "jdbc:mysql://"+serverName+"/"+myDatabase;	//url
    
    /**
     * 
     * @return connection to the db
     */
    public Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
}