/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FiguraGeometrica;

import Punto.Punto;

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public abstract class FiguraGeometrica {
    //atributos
    private Punto EsqSupIzq;
    private String Color;
    private float AnchoLinea;

    public Punto getEsqSupIzq() {
        return EsqSupIzq;
    }
    public void setEsqSupIzq(Punto EsqSupIzq) {
        this.EsqSupIzq = EsqSupIzq;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }
    public float getAnchoLinea() {
        return AnchoLinea;
    }
    public void setAnchoLinea(float AnchoLinea) {
        this.AnchoLinea = AnchoLinea;
    }
    //AREA DE La figura 2D
  public abstract int CalculaArea();
  //Dibujo de la figura 2D
  public abstract void DibujarFigura();
    
}
