/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 *
 * @author SALASC
 */

public class Ejemplo1_5 {
    public static void main(String[] args) {
        corredor t1, t2;
        t1 = new corredor(0);
        t2 = new corredor(0);
        
        t1.start();
        t2.start();
    }
    
}
