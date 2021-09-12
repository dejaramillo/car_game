package connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class _Connection {
    /**
     * getConnection - function that connects the project to the database
     * @return object with data for conect
     */
    public java.sql.Connection getConnection(){
        java.sql.Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/racer_game","root","Poootter01");
        }catch (SQLException e){
            System.out.println(e);
        }
        return connection;
    }
}
