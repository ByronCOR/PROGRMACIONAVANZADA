/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author PC
 */
@Entity
public class Propietario implements Serializable {

    @Id
    /*La anotación @GeneratedValue se usa junto con @Id para que JPA 
genere automáticamente el valor del identificador primario 
(ID) al insertar un nuevo registro.*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProp;
    @Basic
    private String Cedula;
    private String Apellido;
    private String Nombre;

    @OneToMany(mappedBy = "propietario")
    private List<Vehiculo> vehiculos;

    public Propietario() {
    }

    public void setIdProp(int idProp) {
        this.idProp = idProp;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getIdProp() {
        return idProp;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

}
