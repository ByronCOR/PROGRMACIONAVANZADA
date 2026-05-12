/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumarhilospool;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 * @author djaramillo
 */
public class MainSumaPool {
    public static void main(String[] args) throws InterruptedException {
        var pos = 0;
        int a=5;
        int[][] mat = MatrizAleatoria.generateMatrix(8, 8);
        int[] sums = new int[mat.length];
        System.out.println("longitud  "+mat.length);
        var numCores = Runtime.getRuntime().availableProcessors();
        System.out.println("NUmero de CPUS   "+numCores);
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(6);                                 
        // de acuerdo al numero de filas
        CountDownLatch endController = new CountDownLatch(6); //12
        //printMatrix(mat);
        System.out.println("Creando y ejecutando hilos");
        for(var row : mat) {
            Thread thread = new Thread(new HiloSumaFilas(row, pos++, 
                    sums, endController));
            executor.execute(thread);
            //System.out.println(a+"  "+endController);
            
        } //mientras no se termine de ejecutar todos los hilos no se pasará
        endController.await();
        System.out.println("Fin");
        executor.shutdown();
        var sumTotal = 0;
        //printRow(sums);
        System.out.println("Calculando suma final");
        for(var sum : sums) {
            sumTotal += sum;
        }
        System.out.printf("Suma total: %d\n", sumTotal);
        printRow(sums);
        //printMatrix(mat);
   }
    private static void printMatrix(int[][] mat) {
        for (int i=0; i<mat.length;i++){
            for (int j=0; j<mat.length;j++)
                System.out.print(mat[i][j]+" , ");
            System.out.println();
        }
    }
    private static void printRow(int[] sums) {
        for (int i=0; i<=sums.length;i++){
             
        }
    }
}
