/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.model;

import java.sql.Date;

/**
 *
 * @author lopez
 */
public class TransaccionCabecera {
    private int id_transaccion;
    private Date fecha;
    private int id_usuario;
    private float total;

    public int getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
}
