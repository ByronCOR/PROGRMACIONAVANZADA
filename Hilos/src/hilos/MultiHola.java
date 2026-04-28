/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author SALASC
 */
class PruebaTha extends Thread {

    private String nombre;
    private int retardo;

    public PruebaTha(String nombre, int retardo) {
        this.nombre = nombre;
        this.retardo = retardo;
    }

    public void run() {
        try {
            sleep(retardo);

        } catch (InterruptedException e) {;
        }
        System.out.println("Hola Mundo!" + nombre + " " + retardo);
    }

}

public class MultiHola {

    public static void main(String[] args) {
        PruebaTha t2, t3;
        PruebaTha t1 = new PruebaTha("Hilo1", (int) (Math.random() * 2000));
        t2 = new PruebaTha("Hilo2", (int) (Math.random() * 2000));
        t3 = new PruebaTha("Hilo3", (int) (Math.random() * 2000));
        t1.start();
        t2.start();
        t3.start();
    }
}

