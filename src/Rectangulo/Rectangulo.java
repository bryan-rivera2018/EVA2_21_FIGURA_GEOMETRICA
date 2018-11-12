/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo;

import FiguraGeometrica.FiguraGeometrica;
import Punto.Punto;



/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class Rectangulo extends FiguraGeometrica{

    @Override
    public int CalculaArea() {
        private int Base;
        private int Altura;
        
    public int getBase() {
        return Base;
    }

    public void setBase(int Base) {
        this.Base = Base;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    @Override
    public void DibujarFigura() {
        Punto EsqInfIzq, EsqSupDer, EsqInfDer;
        EsqInfIzq = new Punto();
        EsqSupDer = new Punto();
        EsqInfDer = new Punto();
        EsqInfIzq.setX(getEsqSupIzq().getX());
        EsqInfIzq.setY(getEsqSupIzq().getY());
    }
}

 
   
    

