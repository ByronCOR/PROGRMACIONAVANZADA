/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author PC
 */
@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClie;

    private int cedula;
    private String nombres;
    private String apellidos;

    @OneToMany(mappedBy = "cliente")
    private List<Celular> celulares;


    public Cliente() {
    }

    public void setIdClie(int idClie) {
        this.idClie = idClie;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCelulares(List<Celular> celulares) {
        this.celulares = celulares;
    }

    public int getIdClie() {
        return idClie;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public List<Celular> getCelulares() {
        return celulares;
    }


   


}
