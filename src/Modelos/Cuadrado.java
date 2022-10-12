/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author Santiago D
 */
public class Cuadrado extends FiguraEstandar {
    
    private int lado;

    public Cuadrado() {
    }

    public Cuadrado(int direccion,Color colorBorde, Color colorRelleno, int x, int y,int lado) {
        super(direccion,colorBorde, colorRelleno, x, y);
        this.lado = lado;
        this.setArea(new Rectangle(x,y,lado,lado));
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
}
