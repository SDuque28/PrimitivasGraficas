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
public class Cuadrado extends FiguraEstandar {
    
    private int lado;

    public Cuadrado() {
    }

    public Cuadrado(Color colorBorde, Color colorRelleno, int x, int y,int lado) {
        super(colorBorde, colorRelleno, x, y);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
}
