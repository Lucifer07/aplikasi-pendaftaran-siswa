/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugasuas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Maulana Jaelani
 */
public class koneksi {
    private static Connection conn;
     String url = "jdbc:mysql://localhost:3306/uaspbo";
     String user = "root";
     String pass = "akar";
     String driver = "com.mysql.jdbc.Driver";
    public Connection getcon(){
        if(conn == null){
           
            try {
                Class.forName(driver);
                System.out.println("Driver tersedia");
                conn = DriverManager.getConnection(url,user,pass);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conn;
    }
    
}
