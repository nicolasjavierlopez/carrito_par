/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrito.controller;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Conexion {
    
    public Conexion(){
        
    }
    
    public static Connection getConexion()throws SQLException, ClassNotFoundException, NamingException, Exception{
        Connection conexion = null;
        InitialContext cxt = new InitialContext();
        if ( cxt == null ) {
            throw new Exception("Uh oh -- no context!");
        }

        DataSource ds = (DataSource) cxt.lookup( "jdbc/postgres" );
        
        if ( ds == null ) {
            throw new Exception("Data source not found!");
        }
        conexion = ds.getConnection();
        return conexion;
    }
    
    public static void closeConexion(Connection conexion)throws SQLException, ClassNotFoundException{
        conexion.close();
    }
     
}