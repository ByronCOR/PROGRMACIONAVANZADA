/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BData;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SALASC
 */
public class DATPedido {

    Conexiones BLcon = new Conexiones();

    public ResultSet RecuperarPedido() throws ClassNotFoundException, SQLException {
        String Sentencia = "SELECT * FROM Pedidos "; //where idProv = ?
        PreparedStatement ps = BLcon.getConnection().prepareStatement(Sentencia);
        //ps.setInt(1, idProv);
        return ps.executeQuery();
    }
}
