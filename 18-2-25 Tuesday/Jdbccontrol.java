package CRUDoperations;

import java.sql.*;
import java.util.Scanner;

public class Jdbccontrol {
    static String url = "jdbc:mysql://localhost:3306/abcd";
    static String username = "root";
    //Give the password to access MySQL server
    static String password = "Tiger";
    static Scanner in = new Scanner(System.in);
    public static  void selectRecords() throws SQLException {
        String query = "select * from persons";
        //Step 1 - connect database
        Connection connection = DriverManager.
                getConnection(url,username, password);
        //Step 2 - Creating statement
        Statement stmt = connection.createStatement();
        //Step 3 - Executing query and Processing resultset
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()) {
            System.out.print("\nId is:" + rs.getInt(1));
            System.out.print("\nFirstname is:" + rs.getString(2));
            System.out.print("\nLastnameame is:" + rs.getString(3));
            System.out.print("\nAddress is:" + rs.getString(4));
            System.out.print("\ncity is:" + rs.getString(5));

        }
        //Step 4 - Close connection
        connection.close();
    }

    public static  void selectRecordsWithPreparedStatement(int id) throws SQLException {

        //Step 1 - connect database
        Connection connection = DriverManager.
                getConnection(url,username, password);
        //Step 2 - Creating statement
        PreparedStatement pstmt = connection.
                prepareStatement("select * from persons where PersonID =?");
        pstmt.setInt(1,id);
        ResultSet rs = pstmt.executeQuery();

        //Step 3 - Executing query and Processing resultset
        // ResultSet rs = pstmt.executeQuery(query);
        while(rs.next()) {
            System.out.print("\nId is:" + rs.getInt(1));
            System.out.print("\nFirstname is:" + rs.getString(2));
            System.out.print("\nLastnameame is:" + rs.getString(3));
            System.out.print("\nAddress is:" + rs.getString(4));
            System.out.print("\ncity is:" + rs.getString(5));
        }
        //Step 4 - Close connection
        connection.close();
    }
    public static void insertRecordWithVariables(int id, String  firstname, String  lastname,String Address,String city ) throws SQLException {

        //String query = "insert into employee values(15, 'ABR',720000);";
        String query = "insert into persons values("+id+", '" + firstname+"','"+lastname+"','"+Address+"','"+city+"');";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        System.out.println("Number of rows affected:"
                +st.executeUpdate(query));
        connect.close();
    }
    public static void deleteRecordWithVariables(int id) throws SQLException {
        String query = "delete from persons where PersonID=" +id+";";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        System.out.println("Number of rows affected:"
                +st.executeUpdate(query));
        connect.close();
    }
    public static void updateRecordWithPreparedStatement(int id, String address) throws SQLException {


        String query = "update Persons set Address=? where PersonID=?;";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setString(1,address);
        pst.setInt(2,id);
        System.out.println("Number of rows affected:"
                +pst.executeUpdate());
        connect.close();
    }

}
