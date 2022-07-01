/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenfinal22;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author Alvaro
 */
public class VentaDebuxo extends JFrame{
    private Lenzo lenzo;
    private JButton btArchivo; 
    private JButton btCor; 
    private JComboBox cbDebuxos;
    private JFileChooser fc;

    public VentaDebuxo() {
        setTitle("Debuxando con arquivos de texto");
        setSize(new Dimension(100, 100));
        setVisible(true);
        add(lenzo);
        add(btArchivo);
        add( btCor);
        add(cbDebuxos);
        add(fc);
        
        
    }
    
    
    
    
}





