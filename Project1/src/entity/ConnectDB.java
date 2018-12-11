/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nguyen Thanh Binh
 */
public class ConnectDB {
    
     private static String DB_URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=Project1";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "0971621598mk";
    public static Connection conn = null;
    
    public void connectDB(){
       try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            System.out.println("connect successful!");
        } catch (Exception ex) {
            System.out.println("connect fail!");
            ex.printStackTrace();
        }
        
    }
    public void closeDB() throws SQLException{
        if(conn != null)
            conn.close();
    }
    public static void main(String[] args) throws SQLException {
        ConnectDB c = new ConnectDB();
        c.connectDB();
        c.closeDB();
    }
}
