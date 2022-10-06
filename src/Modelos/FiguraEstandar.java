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
public abstract class FiguraEstandar extends FiguraGeometrica{
    
    private int x;
    private int y;

    public FiguraEstandar() {
    }

    public FiguraEstandar(int direccion,Color colorBorde, Color colorRelleno,int x,int y) {
        super(direccion,colorBorde, colorRelleno);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void moverDE(int distancia){
        this.x += distancia;
    }
    
    public void moverIZ(int distancia){
        this.x -= distancia;
    }
    
    public void moverAR(int distancia){
        this.y -= distancia;
    }
    
    public void moverAB(int distancia){
        this.y += distancia;
    }
}
