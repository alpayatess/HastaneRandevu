
package com.JDBConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class JavaBaglanti {
    Connection con;
    public static Connection ConnectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:Hastane.db");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }  
    }
}
