/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.awt.Color;

/**
 *
 * @author Santiago D
 */
public class Poligono extends FiguraGeometrica{
    
    private int x[];
    private int y[];

    public Poligono() {
    }

    public Poligono(int direccion,Color colorBorde, Color colorRelleno,int[] x, int[] y) {
        super(direccion,colorBorde, colorRelleno);
        this.x = x;
        this.y = y;
    }

    public int[] getX() {
        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public int[] getY() {
        return y;
    }

    public void setY(int[] y) {
        this.y = y;
    }
    
    
}
