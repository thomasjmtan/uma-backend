package com.tart.Repository;

import java.sql.*;

public class UmaRepository {

    static String url = "jdbc:postgresql://localhost:5432/uma", username = "postgres", password = "230899";

    public static void InsertUmamusume(String name, Integer yob, Boolean isStallion) {
        String insertSql = "INSERT INTO musume (name, yearofbirth, isstallion) VALUES (?, ?, ?)";

        try(Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(insertSql)) {

            ps.setString(1, name);
            ps.setInt(2, yob);
            ps.setBoolean(3, isStallion);

            int rowsInserted = ps.executeUpdate();  // execute the insert
            System.out.println("Rows inserted: " + rowsInserted);

        } catch(SQLException e) {
            System.out.println("Error handled at `InsertUmamusume()`");
            e.printStackTrace();
        }
    }

    public static void GetDBColumns() {
        String getColSql = "SELECT column_name " + "FROM information_schema.columns " + "WHERE table_name = 'musume'";

        try(Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(getColSql)) {

            while (set.next()) {
                String colName = set.getString("column_name");
                //String colType = rs.getString("data_type");
                System.out.println(colName);
            }


        } catch(SQLException e) {
            System.out.println("Error handled at `GetDBColumns()`");
            e.printStackTrace();
        }
    }

}
