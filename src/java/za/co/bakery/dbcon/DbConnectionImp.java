
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.bakery.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Studio13
 */
public class DbConnectionImp implements DbConnection{

    @Override
    public Connection ConnectDb() {
       Connection con =null ;
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("agg cannot find the driver " + ex.getMessage());
        }
        System.out.println("Driver loaded");
        String ourURI = "jdbc:derby:D:\\ClassGroupProject\\MrsPatBakeryOnlineSystem\\Database\\BakerySystemDbb;";
    
      // String password = "secret";
     //  String username = "bob";
        try {
           //con = DriverManager.getConnection(ourURI, username, password);
           con = DriverManager.getConnection(ourURI);
        } catch (SQLException ex) {
            System.out.println("Connection error " + ex.getMessage());
            System.exit(0);
        }
        
    return  con;
    }
    
    private void runMe(){
     ConnectDb();
    }
    public static void main(String[] args) {
       new DbConnectionImp().runMe();
    }
}
