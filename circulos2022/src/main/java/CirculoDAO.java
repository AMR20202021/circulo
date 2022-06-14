
import java.awt.Color;
import java.awt.Point;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvaro
 */
public class CirculoDAO {
    private final Connection conexion;
   
    public CirculoDAO(Connection conexion){
        this.conexion=conexion;
        
    }
    public ArrayList<Circulo> getAll(){
        ArrayList<Circulo> circulos = new ArrayList<>();
        try{
       Statement st = conexion.createStatement();
       ResultSet rs = st.executeQuery("Select x, y, radio, r, g, b" + "From Circulo");
       while (rs.next()){
           int x = rs.getInt(1);
           int y = rs.getInt(2);
           int radio = rs.getInt(3);
           int r = rs.getInt(4);
           int g = rs.getInt(5);
           int b = rs.getInt(6);
           

           Circulo c = new Circulo(new Point(x,y), radio, new Color(r,g,b));
           circulos.add(c);        
       }
        }catch(SQLException ex){
            System.out.println("Sin Conexión");
        }
          return circulos;
    }
  
    public int save (Circulo circulo){
        PreparedStatement st;
        try {
            st = conexion.prepareStatement("INSERT INTO Circulo (x, y, radio, r, g, b)VALUES(?,?,?,?,?,?) ");
            st.setInt(1, circulo.getCentro().x);
            st.setInt(2, circulo.getCentro().y);
            st.setInt(3, circulo.getRadio());
            st.setInt(4, circulo.getCor().getRed());
            st.setInt(5, circulo.getCor().getGreen());
            st.setInt(6, circulo.getCor().getBlue());
            return st.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error al guardar el circulo");
        }
        return 0;
    }
    
}












