/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BData;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author djaramillo
 */
public class DATPedido {
    Conexiones BLcon = new Conexiones();
    public ResultSet RecuperarPedido() throws ClassNotFoundException, SQLException {   
        String Sentencia = "SELECT * FROM Pedidos "; //where idProv = ?
        PreparedStatement ps= BLcon.getConnection().prepareStatement(Sentencia);
        //ps.setInt(1, idProv);
        return ps.executeQuery();
    }
}
