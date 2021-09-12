package serviceDao;

import connection._Connection;
import model.Driver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayersCRUD {
    /**
     * createPlayer - function that create players in the data base
     * @param driver object for save
     */
    public static void createPlayer(Driver driver){
        _Connection dbConnection = new _Connection();
        try (Connection cxn = dbConnection.getConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO players (name,user_name) VALUE (?, ?)";
                ps = cxn.prepareStatement(query);
                ps.setString(1, driver.getName());
                ps.setString(2, driver.getUserName());
                ps.executeUpdate();
                System.out.println("Piloto creado");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }



    /**
     * readplayer - function that displays all players stored in the database
     */
    public static void readPlayer() {
        int i = 1;
        _Connection dbConnection = new _Connection();
        try (Connection cxn = dbConnection.getConnection()) {
            PreparedStatement ps = null;
            ResultSet rs;
            try {
                String query = "SELECT * FROM  players";
                ps = cxn.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println(i + ".Player: " + rs.getString("name"));
                    System.out.println("User name: " + rs.getString("user_name"));
                    System.out.println("-----------------------");
                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("No se pueden recuperar los datos");
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * @return array object with driver list
     */
    public static Driver[] showDriverMenu() {
        Driver[] driver = new Driver[100];
        int i = 0;
        _Connection dbConnection = new _Connection();
        try (Connection cxn = dbConnection.getConnection()) {
            PreparedStatement ps = null;
            ResultSet rs = null;
            try {
                String query = "SELECT * FROM  players";
                ps = cxn.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    driver[i] = new Driver();
                    driver[i].setPlayerId(rs.getInt("player_id"));
                    driver[i].setName(rs.getString("name"));
                    driver[i].setUserName(rs.getString("user_name"));
                    i++;
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return driver;
    }

    /**
     * validateUserName - function that queries user names
     * @return string array with list de user name
     */
    public static String[] validateUserName() {
        String[] stringValidate = new String[100];
        int i = 0;
        _Connection dbConnection = new _Connection();
        try (Connection cxn = dbConnection.getConnection()) {
            PreparedStatement ps = null;
            ResultSet rs;
            try {
                String query = "SELECT user_name FROM  players";
                ps = cxn.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    stringValidate[i] =  rs.getString("user_name");
                    i++;
               }
            } catch (SQLException ex) {
                System.out.println("No se pueden recuperar los datos");
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return stringValidate;
    }
}
