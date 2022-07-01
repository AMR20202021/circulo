/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenfinal22;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author Alvaro
 */
public class Lenzo extends JPanel{
    private final int RADIO=10;
    private final int ANCHO=400;
    private final int ALTO=410;
    private Debuxo debuxo;

    public Lenzo() {
        Dimension d= new Dimension(ANCHO, ALTO);
        setPreferredSize(d);
        setBackground(Color.white);
    }

    public Debuxo getDebuxo(){
        return debuxo;
    }
    
    public void setDebuxo(Debuxo debuxo){
        this.debuxo=debuxo;
    }
    
    public void setCor(Color cor){
        debuxo.setCor(cor);
    
}
    public Color getCor(){
        return debuxo.getCor();
    }
    
}



