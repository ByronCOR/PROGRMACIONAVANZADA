/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import BData.DATPedido;
import Clases.Pedido;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author djaramillo
 */
public class LogPedido {
    DATPedido objDATPedido = new DATPedido();
    public ArrayList<Pedido> BuscarPedidos(ArrayList<Pedido> ArrayPedidos) throws ClassNotFoundException, SQLException{
        //ArrayList<Pedido> ArrayPedidos = new ArrayList<Pedido>();
        Pedido objPedido = new Pedido();
        ResultSet rs = objDATPedido.RecuperarPedido();
        while (rs.next()){
                objPedido = new Pedido();
                objPedido.setIdped(rs.getInt(1));
                objPedido.setProducto(rs.getString(2));
                objPedido.setCant(rs.getInt(3));
                objPedido.setObservacion(rs.getString(4));
                objPedido.setLugar(rs.getInt(5));
                
                ArrayPedidos.add(objPedido);
        }
        rs.close();
        return ArrayPedidos;
    }

    
}

