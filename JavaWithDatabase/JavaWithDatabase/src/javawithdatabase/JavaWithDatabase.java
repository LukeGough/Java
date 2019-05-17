/*  
    Class: Cluster - Java II
    Name: Luke Gough
    Student ID: 30003918
 */
package javawithdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaWithDatabase {

    public static void main(String[] args) {
        // create variables to access the database and run queries/statements
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "usbw";

        Connection con = null;
        Statement stmt = null;
        String query;
        ResultSet result = null;

        // try, catch and finallly blocks
        try {
            con = DriverManager.getConnection(url, user, password); //connect to db
            // first display
            stmt = con.createStatement();
            query = "SELECT * FROM scores;";
            result = stmt.executeQuery(query);

            System.out.printf("%-15s%s\n", "SubjectName", "Score");

            while (result.next()) {
                String subjectName = result.getString("SubjectName");
                int score = result.getInt("Score");

                System.out.printf("%-15s%-15s\n", subjectName, score);
            }

            // update English score to 90
            query = "UPDATE scores SET Score=90 WHERE SubjectName=\"English\";";
            stmt.executeUpdate(query);
            
            // second display
            query = "SELECT * FROM scores;";
            result = stmt.executeQuery(query);
            
            System.out.printf("\n%-15s%s\n", "SubjectName", "Score");

            while (result.next()) {
                String subjectName = result.getString("SubjectName");
                int score = result.getInt("Score");

                System.out.printf("%-15s%-15s\n", subjectName, score);
            }

        } catch (SQLException ex) {
            System.out.println("SQLException caught: " + ex.getMessage());
        } finally {
            try {
                if (result != null) {
                    result.close();
                }

                if (stmt != null) {
                    stmt.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println("SQLException caught: " + ex.getMessage());
            }
        }
    }
}
