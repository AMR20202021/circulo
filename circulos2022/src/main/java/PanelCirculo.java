
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alvaro
 */
public class PanelCirculo extends JPanel implements MouseListener, MouseMotionListener{

    private Color cor;
    private Circulo circulo;
    
    private ArrayList<Circulo> circulos= new ArrayList<>();

    public ArrayList<Circulo> getCirculos() {
        return circulos;
    }

    public void setCirculos(ArrayList<Circulo> circulos) {
        this.circulos = circulos;
    }

    public PanelCirculo() {
        setBackground(Color.WHITE);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
     
    public void paintComponet(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.Cor = Color.BLUE;
        for (Circulo c : circulos){
            g.setColor(c.getCor());
            g.fillOval(c.getPuntoInicio().x, c.getPuntoInicio().y,c.getAncho(),c.getAlto());
        }
            if (circulo!=null){
                g.setColor(circulo.getCor());
            g.fillOval(circulo.getPuntoInicio().x, circulo.getPuntoInicio().y,circulo.getAncho(),circulo.getAlto());
            }
    }
    
    public void Limpar(){
        circulos.clear();
        this.repaint();
        
    }
    /**
     * Get the value of circulo
     *
     * @return the value of circulo
     */
    public Circulo getCirculo() {
        return circulo;
    }

    /**
     * Set the value of circulo
     *
     * @param circulo new value of circulo
     */
    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }


    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
      circulo = new Circulo(e.getPoint(),cor);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(circulo!=null){
            circulo.setRadio((int) circulo.getCentro().distance(e.getPoint()));
            circulos.add(circulo);
            circulo=null;
        }
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
      
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        circulo.setRadio((int) circulo.getCentro().distance(e.getPoint()));
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }

}





