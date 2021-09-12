package serviceDao;

import model.Circuits;
import connection._Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class circuitsCRUD {
    /**
     * createCircuit - function that creates a circuit type element in the database
     *
     * @param circuit - object with information for save in the data base
     */
    public static void createCircuit(Circuits circuit) {
        _Connection dbConnection = new _Connection();
        try (Connection cxn = dbConnection.getConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO circuits (circuit_name,distance) VALUE (?, ?)";
                ps = cxn.prepareStatement(query);
                ps.setString(1, circuit.getName());
                ps.setDouble(2, circuit.getDistance());
                ps.executeUpdate();
                System.out.println("Circuito creado");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * readCircuit - function that displays all circuits stored in the database
     */
    public static void readCircuit() {
        int iterator = 1;
        _Connection dbConnection = new _Connection();
        try (Connection cxn = dbConnection.getConnection()) {
            PreparedStatement ps = null;
            ResultSet rs;
            try {
                String query = "SELECT * FROM  circuits";
                ps = cxn.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println(iterator+".Ciruit: " + rs.getString("circuit_name"));
                    System.out.println("Distance: " + rs.getDouble("distance") + " km.");
                    System.out.println("-----------------------");
                    iterator++;
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
     * updateCircuit - function that updates the data of a circuit
     *
     * @param circuit
     */
    public static void updateCircuit(Circuits circuit) {
        _Connection dbConnection = new _Connection();
        try (Connection cxn = dbConnection.getConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "UPDATE circuits SET circuit_name = ?, distance = ? WHERE circuit_id = ?";
                ps = cxn.prepareStatement(query);
                ps.setString(1, circuit.getName());
                ps.setDouble(2, circuit.getDistance());
                ps.setInt(3, circuit.getId());
                ps.executeUpdate();
                System.out.println("Circuito actualizado");
            } catch (SQLException ex) {
                System.out.println("No se actualizaron los datos del circuito");
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * deleteCircuit - deletes the circuit according to its id
     * @param idCircuit id for select circuit by delete
     */
    public static void deleteCircuit(int idCircuit) {
        _Connection dbConnection = new _Connection();
        try (Connection cxn = dbConnection.getConnection()) {
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM circuits WHERE circuit_id = ?";
                ps = cxn.prepareStatement(query);
                ps.setInt(1, idCircuit);
                ps.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("Circuito no elimiando");
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static Circuits[] showCircuitsMenu() {
        Circuits[] circuits = new Circuits[100];
        int i = 0;
        _Connection dbConnection = new _Connection();
        try (Connection cxn = dbConnection.getConnection()) {
            PreparedStatement ps = null;
            ResultSet rs = null;
            try {
                String query = "SELECT * FROM  circuits";
                ps = cxn.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    circuits[i] = new Circuits();
                    circuits[i].setName(rs.getString("circuit_name"));
                    circuits[i].setDistance(rs.getDouble("distance"));
                    i++;
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return circuits;
    }
}
