/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdesarrollo.vista;

import java.util.ArrayList;
import java.util.List;
import parcialdesarrollo.modelo.Cuadrado;
import parcialdesarrollo.modelo.FiguraGeometrica;
import parcialdesarrollo.modelo.Rectangulo;
import parcialdesarrollo.modelo.Triangulo;

/**
 *
 * @author Michael
 */
public class ParcialDesarrollo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<FiguraGeometrica> listaFiguras = new ArrayList();
        
        listaFiguras.add(new Triangulo(5, 3, 2, 2));
        listaFiguras.add(new Cuadrado(2));
        listaFiguras.add(new Rectangulo(2, 5));
        
        System.out.println("JSON:");
        System.out.println("{\"Figura Geometrica\":["+listaFiguras.get(0).toString() +","+ listaFiguras.get(1).toString() +","+ listaFiguras.get(2).toString() + "]}");
        
        
    }
    
}
