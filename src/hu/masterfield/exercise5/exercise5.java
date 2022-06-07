package hu.masterfield.exercise5;

import hu.masterfield.exercise1.GabonakDataSource;
import hu.masterfield.exercise2.Gabona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class exercise5 {
    public static void main(String[] args) {

    }

    public static List<Gabona> getGabonaList() {
        List<Gabona> gabonak = new ArrayList<>();
        try (Connection con = DriverManager.getConnection("jdbc:derby:exercise5;create=true");
             Statement stmt = con.createStatement()) {
            String sql = "SELECT * FROM GABONAK ORDER BY Megnevezes DESC";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                gabonak.add(new Gabona(
                                rs.getInt("Id"),
                                rs.getString("Megnevezes"),
                                rs.getDouble("Feherje"),
                                rs.getDouble("Zsir"),
                                rs.getDouble("Szenhidrat"),
                                rs.getDouble("Kaloria")
                        )
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return gabonak;
    }

    public static void retriveRecords() { // lekérdezés!
        try (Connection con = DriverManager.getConnection("jdbc:derby:exercise5;create=true");
             Statement stmt = con.createStatement()) {
            String sql = "SELECT * FROM GABONAK ORDER BY Id";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Sorszám: " + rs.getInt("Id") +
                        " Név: " + rs.getString("Megnevezes") +
                        " Fehérje: " + rs.getDouble("Feherje") +
                        " Zsir: " + rs.getDouble("Zsir") +
                        " Szénhirát: " + rs.getDouble("Szenhidrat") +
                        " Kalória: " + + rs.getDouble("Kaloria"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void insertRecords() { // beszúrja az adatokat !
        String query = "INSERT INTO GABONAK VALUES (?,?,?,?,?,?)";
        String[][] gabonak = GabonakDataSource.getGabonak();
        try (Connection con = DriverManager.getConnection("jdbc:derby:exercise5;create=true");
             PreparedStatement preparedStatement = con.prepareStatement(query)) {
            for (String[] gabona : gabonak) {
                preparedStatement.setInt(1, Integer.parseInt(gabona[0]));
                preparedStatement.setString(2, gabona[1]);
                preparedStatement.setDouble(3, Double.parseDouble(gabona[2]));
                preparedStatement.setDouble(4, Double.parseDouble(gabona[3]));
                preparedStatement.setDouble(5, Double.parseDouble(gabona[4]));
                preparedStatement.setDouble(6, Double.parseDouble(gabona[5]));
                preparedStatement.executeUpdate();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void updateRecord(String[] gabona) {
        String query = "UPDATE GABONAK SET Megnevezes = ?, Feherje = ?, Zsir = ?, Szenhidrat = ?, Kaloria = ? WHERE Id = ?";
        String[][] gabonak = GabonakDataSource.getGabonak();
        try (Connection con = DriverManager.getConnection("jdbc:derby:exercise5;create=true");
             PreparedStatement preparedStatement = con.prepareStatement(query)) {
            preparedStatement.setString(1, gabona[1]);
            preparedStatement.setDouble(2, Double.parseDouble(gabona[2]));
            preparedStatement.setDouble(3, Double.parseDouble(gabona[3]));
            preparedStatement.setDouble(4, Double.parseDouble(gabona[4]));
            preparedStatement.setDouble(5, Double.parseDouble(gabona[5]));
            preparedStatement.setInt(6, Integer.parseInt(gabona[0]));
            preparedStatement.executeUpdate();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void createTable() {
        String query = "CREATE TABLE GABONAK ("
                + "Id INT NOT NULL, "
                + "Megnevezes VARCHAR(255),"
                + "Feherje FLOAT, "
                + "Zsir FLOAT, "
                + "Szenhidrat FLOAT, "
                + "Kaloria FLOAT, "
                + "PRIMARY KEY (Id))";

        try (Connection con = DriverManager.getConnection("jdbc:derby:exercise5;create=true");
             Statement stmt = con.createStatement()) {
            stmt.executeUpdate(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
