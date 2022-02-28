 package utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

  public static Connection getConn() {
    String loadDriver="com.mysql.jdbc.Driver";
    String dbURL="jdbc:mysql://localhost:8080/employeedeatils";
    String dbUSERNAME="root";
    String dbPASSWORD="examly";
    
    Connection con = null;
    try {
      Class.forName(loadDriver);
      con = DriverManager.getConnection(dbURL,dbUSERNAME,dbPASSWORD);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return con;
  }
}