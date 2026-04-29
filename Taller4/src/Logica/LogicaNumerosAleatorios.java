/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import BaseDatos.BDNumerosAleatorios;
import Clases.NumerosAleatorios;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author SALASC
 */
public class LogicaNumerosAleatorios {

    BDNumerosAleatorios objBDNA = new BDNumerosAleatorios();

    public boolean IngresarNumeros(NumerosAleatorios objNA) throws ClassNotFoundException, SQLException {

        int totalRegistros = ContarRegistros();

        if (totalRegistros >= 1000) {
            return false;
        }

        int espacioDisponible = 1000 - totalRegistros;

        if (espacioDisponible < 5) {
            return false;
        }

        objBDNA.InsertarNumeros(objNA);
        return true;
    }

    public int ContarRegistros() throws ClassNotFoundException, SQLException {
        return objBDNA.ContarRegistros();
    }
}
