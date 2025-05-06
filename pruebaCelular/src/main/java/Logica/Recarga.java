/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author PC
 */
@Entity
public class Recarga implements Serializable {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReca;

    private int valor;
    private int saldo;
    private int megas;

    @ManyToOne
    @JoinColumn(name = "celular_id")
    private Celular celular;

    public Recarga() {
    }

    public void setIdReca(int idReca) {
        this.idReca = idReca;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setMegas(int megas) {
        this.megas = megas;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public int getIdReca() {
        return idReca;
    }

    public int getValor() {
        return valor;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getMegas() {
        return megas;
    }

    public Celular getCelular() {
        return celular;
    }
    
    
}
