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
public class Vehiculo implements Serializable {
@Id
/*La anotación @GeneratedValue se usa junto con @Id para que JPA 
genere automáticamente el valor del identificador primario 
(ID) al insertar un nuevo registro.*/
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idVehi;
@Basic 
private String Placa;
private String Marca;
private int Estado;

@ManyToOne
@JoinColumn(name = "idProp") 
private Propietario propietario;

@OneToMany(mappedBy = "vehiculos")  
private List<Turno> turnos;

    public Vehiculo() {
    }

    public void setIdVehi(int idVehi) {
        this.idVehi = idVehi;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }


    public int getIdVehi() {
        return idVehi;
    }

    public String getPlaca() {
        return Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public int getEstado() {
        return Estado;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

 


}
