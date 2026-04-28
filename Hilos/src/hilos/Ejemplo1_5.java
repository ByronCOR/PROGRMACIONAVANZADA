/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author SALASC
 */
class corredor extends Thread  {
    static volatile boolean hayGanador=false;
        boolean gano;
        int pasos;

        public corredor(int paso) {
            this.gano = false;
            this.pasos = paso;
        }
        
          
        public void run(){
            int pasos=0;
            int num;
            while (!gano&& !hayGanador){
                num = (int) (Math.random() * 5);
                pasos+=num;
                System.out.println(currentThread().getName() + "  "+ pasos);
                if (pasos > 100)
                    gano = true;
                hayGanador = true;
                try {
                    sleep( num );
                } catch( InterruptedException e ) {
                    ;
                }
            }
            if (gano){
                System.out.println(currentThread().getName() + "    gano   ");
            }
        }
    }

public class Ejemplo1_5 {
    public static void main(String[] args) {
        corredor t1, t2;
        t1 = new corredor(0);
        t2 = new corredor(0);
        
        t1.start();
        t2.start();
    }
    
}

