/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Presentacion;

import Clases.Tabla;
import Logica.LogicaTabla;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author SALASC
 */
public class PD_Cord_Byro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        LogicaTabla objBDT = new LogicaTabla();
        for (int i = 0; i <= 401; i++) {
            Tabla objT = new Tabla();

            objT.setCol1((int) (Math.random() * 20) + 1);
            objT.setCol2((int) (Math.random() * 20) + 1);
            objT.setCol3((int) (Math.random() * 20) + 1);
            objT.setCol4((int) (Math.random() * 20) + 1);

            List<Tabla> numeros = List.of(objT);

            boolean resultado = objBDT.IngresarNumeros(numeros);
            if (resultado) {
                System.out.println("numeros registrado correctamente" + (i + 1));
            } else {
                System.out.println("numeros maximo agregados");

            }

        }

    }
}
