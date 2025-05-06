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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author PC
 */
@Entity
public class Turno implements Serializable {
@Id
/*La anotación @GeneratedValue se usa junto con @Id para que JPA 
genere automáticamente el valor del identificador primario 
(ID) al insertar un nuevo registro.*/
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idTurn;
@Basic 
private int anden;
private int dia;
private int hora;

@ManyToOne
@JoinColumn(name = "idVehi") 
private Vehiculo vehiculos;


    public Turno() {
    }

    public void setVehiculos(Vehiculo vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void setIdTurn(int idTurn) {
        this.idTurn = idTurn;
    }

    public void setAnden(int anden) {
        this.anden = anden;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getIdTurn() {
        return idTurn;
    }

    public int getAnden() {
        return anden;
    }

    public int getDia() {
        return dia;
    }

    public int getHora() {
        return hora;
    }

    public Vehiculo getVehiculos() {
        return vehiculos;
    }

    
    


}
