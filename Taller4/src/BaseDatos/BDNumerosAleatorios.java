/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import Clases.NumerosAleatorios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author SALASC
 */
public class BDNumerosAleatorios {

    Conexion BLcon = new Conexion();

    public int InsertarNumeros(NumerosAleatorios objNumerosAleatorios)
            throws ClassNotFoundException, SQLException {

        String sentencia = "INSERT INTO numerosaleatorios(fila1, fila2, fila3, fila4, fila5)"
                + " VALUES(?,?,?,?,?)";

        try (Connection cn = BLcon.getConnection(); PreparedStatement ps = cn.prepareStatement(sentencia)) {

            ps.setInt(1, objNumerosAleatorios.getFila1());
            ps.setInt(2, objNumerosAleatorios.getFila2());
            ps.setInt(3, objNumerosAleatorios.getFila3());
            ps.setInt(4, objNumerosAleatorios.getFila4());
            ps.setInt(5, objNumerosAleatorios.getFila5());

            return ps.executeUpdate();
        }
    }

    public int ContarRegistros() throws SQLException, ClassNotFoundException {

        String sql = "SELECT COUNT(*) FROM numerosaleatorios";

        try (Connection cn = BLcon.getConnection(); 
                PreparedStatement ps = cn.prepareStatement(sql); 
                ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                return rs.getInt(1);
            }
        }

        return 0;
    }

}
