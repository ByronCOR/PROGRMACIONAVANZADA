/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;

import Clases.NumerosAleatorios;
import Logica.LogicaNumerosAleatorios;
import java.sql.SQLException;

/**
 *
 * @author SALASC
 */
public class Taller4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        NumerosAleatorios objNA = new NumerosAleatorios();
        LogicaNumerosAleatorios objBDNA = new LogicaNumerosAleatorios();
        while (objBDNA.ContarRegistros() <= 1000) {

            objNA.setFila1((int) (Math.random() * 20) + 1);
            objNA.setFila2((int) (Math.random() * 20) + 1);
            objNA.setFila3((int) (Math.random() * 20) + 1);
            objNA.setFila4((int) (Math.random() * 20) + 1);
            objNA.setFila5((int) (Math.random() * 20) + 1);

            boolean resultado = objBDNA.IngresarNumeros(objNA);
            if (resultado) {
                System.out.println("numeros registrado correctamente");
            } else {
                System.out.println("numeros maximo agregados");
                break;
            }
        }

    }

}
