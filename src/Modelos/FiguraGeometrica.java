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
public abstract class FiguraGeometrica {
    
    private Color colorBorde;
    private Color colorRelleno;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(Color colorBorde, Color colorRelleno) {
        this.colorBorde = colorBorde;
        this.colorRelleno = colorRelleno;
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
