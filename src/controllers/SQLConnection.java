package controllers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;


@SuppressWarnings("unused")
public class SQLConnection {
    Connection con = null;
	public static Connection DBConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cedra"+"?useSSL=false","root","root");
		    return con;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,e);
			return null;
		}
	}
}
