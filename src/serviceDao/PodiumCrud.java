package serviceDao;

import connection._Connection;
import model.Podium;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PodiumCrud {
    /**
     * createPodiumWinner - function that stores winners in the database
     * @param podium - object with winners data
     */
    public static void createPodumWnner(Podium podium){
        _Connection dbConnection = new _Connection();
        try (Connection cxn = dbConnection.getConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO podium (first_place,second_place,third_place) VALUE (?, ?, ?)";
                ps = cxn.prepareStatement(query);
                ps.setString(1, podium.getFirstPlace().getUserName());
                ps.setString(2, podium.getSecondPlace().getUserName());
                ps.setString(3, podium.getThirdPlace().getUserName());
                ps.executeUpdate();
                System.out.println("Podio Creado");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * readPodium - function that prints the winners by race
     */
    public static void readPodium(){
        int i = 0;
        _Connection dbConnection = new _Connection();
        try (Connection cxn = dbConnection.getConnection()) {
            PreparedStatement ps = null;
            ResultSet rs;
            try {
                String query = "SELECT * FROM  podium";
                ps = cxn.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println("Carrera #"+ (i + 1));
                    System.out.println("First Place: " + rs.getString("first_place"));
                    System.out.println("Second Place: " + rs.getString("second_place"));
                    System.out.println("Third Place: " + rs.getString("third_place"));
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

}
