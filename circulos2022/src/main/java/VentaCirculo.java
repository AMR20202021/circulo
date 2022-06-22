
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
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
public class VentaCirculo extends JFrame implements WindowListener {
    private PanelCirculo panel;
    private CirculoDAO circuloDAO;
    
    public VentaCirculo(String titulo) {
        
        setTitle(titulo);
        setSize(400,550);
        setVisible(true);
        PanelCirculo mipanel= new PanelCirculo();
        add(mipanel);
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
       
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
    
}
