
import java.awt.Color;
import java.awt.Point;
import javax.lang.model.SourceVersion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvaro
 */
public class Circulo {
    private static final Color DEFAULT_COLOR = new Color(6, 111, 169);
    private Point centro;
    private int radio;
    private Color cor;

    public Circulo(Point centro) {
        this.centro = centro;
        this.cor=DEFAULT_COLOR;
        
    }

    public Circulo(Point centro, int radio, Color cor) {
        this.centro = centro;
        this.radio = radio;
        this.cor = cor;
    }
    

    public Circulo(Point centro, Color cor) {
        this.centro = centro;
        this.cor = cor;
    }

    Circulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Point getCentro() {
        return centro;
    }

    public void setCentro(Point centro) {
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }
    
    public Point getPuntoInicio(){
        Point p = new Point(centro.x-radio,centro.y-radio);
        return p;
    }
    
    public int getAncho(){
        return radio*2;
    }
    public int getAlto(){
        return radio*2;
    }
    public int getX(){
        return centro.x;
    }
    public int getY(){
        return centro.y;
    }

    @Override
    public String toString() {
        return "AppCirculo{" + "centro=" + centro + ", radio=" + radio + ", cor=" + cor + '}';
    }
}



