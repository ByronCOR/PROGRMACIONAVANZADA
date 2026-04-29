/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author SALASC
 */
public class NumerosAleatorios {
    private int fila1;
    private int fila2;
    private int fila3;
    private int fila4;
    private int fila5;

    public NumerosAleatorios() {
    }

    public NumerosAleatorios(int fila1, int fila2, int fila3, int fila4, int fila5) {
        this.fila1 = fila1;
        this.fila2 = fila2;
        this.fila3 = fila3;
        this.fila4 = fila4;
        this.fila5 = fila5;
    }

    public void setFila1(int fila1) {
        this.fila1 = fila1;
    }

    public void setFila2(int fila2) {
        this.fila2 = fila2;
    }

    public void setFila3(int fila3) {
        this.fila3 = fila3;
    }

    public void setFila4(int fila4) {
        this.fila4 = fila4;
    }

    public void setFila5(int fila5) {
        this.fila5 = fila5;
    }

    public int getFila1() {
        return fila1;
    }

    public int getFila2() {
        return fila2;
    }

    public int getFila3() {
        return fila3;
    }

    public int getFila4() {
        return fila4;
    }

    public int getFila5() {
        return fila5;
    }

    @Override
    public String toString() {
        return "NumerosAleatorios{" + "fila1=" + fila1 
                + ", fila2=" + fila2 
                + ", fila3=" + fila3 
                + ", fila4=" + fila4 
                + ", fila5=" + fila5 + '}';
    }
    
    
}
