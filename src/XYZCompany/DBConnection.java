/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package XYZCompany;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnection {

    public Connection con;

    public Connection getConnection() {
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/salarymanagement", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error connecting to database " + ex);
        }
        return con;
    }
}
