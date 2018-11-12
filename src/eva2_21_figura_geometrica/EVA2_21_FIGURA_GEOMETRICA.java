/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_21_figura_geometrica;

import Punto.Punto;
import Rectangulo.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class EVA2_21_FIGURA_GEOMETRICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectangulo rRec = new Rectangulo();
       Scanner input = new Scanner (System.in);
        System.out.println("Base");
        int iBase = input.nextInt();
        System.out.println("Altura");
        int iAltura = input.nextInt();
        Punto pIni = new Punto ();
        pIni.setY(0);
        pIni.setX(0);
        rRec.setEsqSupIzq(pIni);
        rRec.setBase(iBase);
        rRec.setAltura(iAltura);
        rRec.DibujarFigura();
        System.out.println("\nArea = " + rRec.CalculaArea());
           
    }
    
}

