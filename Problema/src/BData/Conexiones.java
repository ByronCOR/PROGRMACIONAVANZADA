/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BData;
/**
 *
 * @author djaramillo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexiones {
    //Conectarse a la BDD
    public Connection con;
    public Connection getConnection () throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";//"com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/hilos";
        Class.forName(driver);
        return DriverManager.getConnection(url,"root","UTPL");
    }
    public Connection AbrirConexion() throws ClassNotFoundException, SQLException{
        con = getConnection();
        return con;
    }
    public void CerrarConexion() throws SQLException{
       con.close();
    }
}
