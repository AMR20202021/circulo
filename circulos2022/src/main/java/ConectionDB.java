
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvaro
 */
public class ConectionDB {
    private String JDBC_DRIVER="org.sqlite.JDBC";
    private String DB_URL="jdbc:sqlite:círculos.sqlite3";
    private static Connection conexion;
    
    public Connection getConnection(){
        try {
            Class.forName(JDBC_DRIVER);
            conexion = DriverManager.getConnection(DB_URL);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConectionDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConectionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conexion;
    }
}
