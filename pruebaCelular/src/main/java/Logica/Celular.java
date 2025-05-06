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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author PC
 */
@Entity
public class Celular implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCel;

    private String numero;
    private int estado;
    private int saldo;
    private int megas;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "celular", cascade = CascadeType.ALL)
    private List<Recarga> recargas;

    public void setIdCel(int idCel) {
        this.idCel = idCel;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setMegas(int megas) {
        this.megas = megas;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setRecargas(List<Recarga> recargas) {
        this.recargas = recargas;
    }

    public int getIdCel() {
        return idCel;
    }

    public String getNumero() {
        return numero;
    }

    public int getEstado() {
        return estado;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getMegas() {
        return megas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Recarga> getRecargas() {
        return recargas;
    }
    
    
}

    