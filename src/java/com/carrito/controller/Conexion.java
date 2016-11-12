/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.controller;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


/**
 *
 * @author lopez
 */
public class Conexion {
    private String USERNAME = "postgres";
    private String PASSWORD = "pass";
    public Conexion(){
    
    }
    
    public static Connection getConexion()throws SQLException, ClassNotFoundException, NamingException, Exception{
        Connection conexion = null;
        InitialContext cxt = new InitialContext();
        
        if ( cxt == null ) {
            throw new Exception("Uh oh -- no context!");
        }
        
        DataSource ds = (DataSource) cxt.lookup("java:/comp/env/jdbc/postgres");

        if ( ds == null ) {
            throw new Exception("Data source not found!");
        }
        else {
            System.out.println("funciono la conexion");
        }
        conexion = ds.getConnection("postgres","pass");
        return conexion;
    }
    
}
