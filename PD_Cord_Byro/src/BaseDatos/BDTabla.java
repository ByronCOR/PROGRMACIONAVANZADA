/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;

import Clases.Tabla;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author SALASC
 */
public class BDTabla {
    Conexion BLcon = new Conexion();

    public int InsertarNumeros(Tabla objTabla)
            throws ClassNotFoundException, SQLException {

        String sentencia = "INSERT INTO tabla(n1, n2, n3, n4)"
                + " VALUES(?,?,?,?)";

        try (Connection cn = BLcon.getConnection(); PreparedStatement ps = cn.prepareStatement(sentencia)) {

            ps.setInt(1, objTabla.getCol1());
            ps.setInt(2, objTabla.getCol2());
            ps.setInt(3, objTabla.getCol3());
            ps.setInt(4, objTabla.getCol4());
            

            return ps.executeUpdate();
        }
    }

}
