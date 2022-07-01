/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenfinal22;

import java.sql.Connection;

/**
 *
 * @author Alvaro
 */
public class ConnectionDB {
    private String JDBC_DRIVER="org.sqlite.JDBC";
    private String DB_URL="jdbc:sqlite:debuxos.sqlite3";
    private Connection conexion;
    
    public Connection getConnection(){
        return null;
    } 

    
}
