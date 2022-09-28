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
public class Imagen extends FiguraEstandar{
    
    private String url;
    private int ancho;
    private int alto;

    public Imagen() {
    }

    public Imagen(Color colorBorde, Color colorRelleno, int x, int y,String url, int ancho, int alto) {
        super(colorBorde, colorRelleno, x, y);
        this.url = url;
        this.ancho = ancho;
        this.alto = alto;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
}
