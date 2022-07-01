/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenfinal22;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Alvaro
 */
public class Debuxo {

    private final String CHAR_PUNTO = "#";
    private final  Color DEFAULT_COLOR = Color.green;
    private String nome;
    private int idDebuxo;
    private Color cor;
    private ArrayList <Point> puntos;

    public Debuxo(String nome, int r, int g, int b) {
        this.nome = nome;
        this.cor = new Color(r, g, b);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdDebuxo() {
        return idDebuxo;
    }

    public void setIdDebuxo(int idDebuxo) {
        this.idDebuxo = idDebuxo;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public ArrayList<Point> getPuntos() {
        return puntos;
    }

    public void setPuntos(ArrayList<Point> puntos) {
        this.puntos = puntos;
    }
    
    public void addPunto(Point p){
        puntos.add(p);
    }
    public void loadPointsFromFile(String nome,ArrayList puntos){
        this.nome=nome;
        this.puntos=puntos;
        
    }
    
    
}
