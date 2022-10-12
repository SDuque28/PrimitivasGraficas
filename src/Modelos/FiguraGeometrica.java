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
public abstract class FiguraGeometrica {
    
    private Color colorBorde;
    private Color colorRelleno;
    private int direccion;
    private Rectangle area;
    private boolean maquina;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(int direccion,Color colorBorde, Color colorRelleno) {
        this.direccion = direccion;
        this.colorBorde = colorBorde;
        this.colorRelleno = colorRelleno;
        this.maquina = true;
        
    }

    public Rectangle getArea() {
        return area;
    }

    public void setArea(Rectangle area) {
        this.area = area;
    }

    public boolean isMaquina() {
        return maquina;
    }

    public void setMaquina(boolean maquina) {
        this.maquina = maquina;
    }
    
    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public Color getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(Color colorBorde) {
        this.colorBorde = colorBorde;
    }

    public Color getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(Color colorRelleno) {
        this.colorRelleno = colorRelleno;
    }
    
}
