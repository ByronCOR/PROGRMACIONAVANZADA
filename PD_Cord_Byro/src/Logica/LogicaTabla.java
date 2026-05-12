/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BaseDatos.BDTabla;
import Clases.Tabla;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author SALASC
 */
public class LogicaTabla {
     BDTabla objBDTabla = new BDTabla();

    public boolean IngresarNumeros(List<Tabla> objT) throws ClassNotFoundException, SQLException {

        for (var n:objT) {
            objBDTabla.InsertarNumeros(n);
        }
        
        return true;
    }
    
    public boolean ObtenerFactorial(List<Tabla> objT){
     for (var n:objT) {
            for
        }
    
    }


}
