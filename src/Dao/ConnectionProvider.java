/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author M. A. MUKTADEER
 */
public class ConnectionProvider {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "root123");          
            return con;
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, sqle);
//            System.out.println(sqle);
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println(ex);
            return null;
        }
    }
//    public static void main(String[] args) {
//        getConnection();
//    }
    
}
