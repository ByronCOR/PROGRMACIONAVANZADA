/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SALASC
 */
public class Conexion {
     public Connection con;
    public Connection getConnection( ) throws ClassNotFoundException, SQLException{
    
        String driver="com.mysql.cj.jdbc.Driver";    
        String url= "jdbc:mysql://localhost:3306/numerosaleatorios";
        Class.forName(driver);
        return DriverManager.getConnection(url,"root","UTPL");
      
    }
    
    public  Connection AbrirConexion() throws ClassNotFoundException, SQLException {
    con = getConnection();
        return con;
    }
    
    public void CerrarConexion() throws SQLException{
    con.close();
    }
}
