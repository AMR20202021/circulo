
import java.awt.Point;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvaro
 */
public class AppCirculo {
    public static void main(String[] args) {
        /**
        ConectionDB conex = new ConectionDB();
        Connection con = conex.getConnection();
        
        
        //objetos
        CirculoDAO db = new CirculoDAO(con);
        ArrayList<Circulo> cs = db.getAll();
        
        db.save(circulo);
        
        for (Circulo c : cs){
            System.out.println(c);
        }
        */
        
        
        VentaCirculo miventana=new VentaCirculo("proba");
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
    
        
        
}







