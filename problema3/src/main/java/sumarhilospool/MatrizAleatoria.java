/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumarhilospool;

/**
 *
 * @author djaramillo
 */

import java.util.Random;

public class MatrizAleatoria {
    private static Random random = new Random();
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] output = new int[rows][cols];
        for(var i = 0; i < rows; i ++) {
            for(var j = 0; j < cols; j ++) {
                output[i][j] = random.nextInt(21);
            }
        }
        return output;
    }
}

