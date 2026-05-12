/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author djaramillo
 */
public class Pedido {
    int idped;
    String producto;
    int cant;
    String observacion;
    int lugar;

    public Pedido() {
    }

    public Pedido(int idped, String producto, int cant, String observacion, int lugar) {
        this.idped = idped;
        this.producto = producto;
        this.cant = cant;
        this.observacion = observacion;
        this.lugar = lugar;
    }

    public int getIdped() {
        return idped;
    }

    public String getProducto() {
        return producto;
    }

    public int getCant() {
        return cant;
    }

    public String getObservacion() {
        return observacion;
    }

    public int getLugar() {
        return lugar;
    }

    public void setIdped(int idped) {
        this.idped = idped;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idped=" + idped + ", producto=" + producto + ", cant=" + cant + ", observacion=" + observacion + ", lugar=" + lugar + '}';
    }
    
    
    
}
