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
public class Circulo extends FiguraEstandar{
    
    private int radio;

    public Circulo() {
    }

    public Circulo(int direccion,Color colorBorde, Color colorRelleno, int x, int y,int radio) {
        super(direccion,colorBorde, colorRelleno, x, y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
}
