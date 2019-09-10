/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdesarrollo.modelo;

/**
 *
 * @author Michael
 */
public class Cuadrado extends FiguraGeometrica{
    
    private static final String NOMBRE = "cuadrado";
    private float lado;
    /**
     * 
     * @param lado
     * @param area
     * @param perimetro 
     */
    public Cuadrado(float lado) {
        this.lado = lado;
    }
    

    @Override
    public float getPerimetro() {
        return lado*4;
    }

    @Override
    public float getArea() {
        return lado*lado;
    }
    @Override
    public String getNombre() {
        return NOMBRE;
    }

    @Override
    public String toString() {
        return "{\"Cuadrado\":{" + "\"lado\":" + lado + '}'+'}';
    }
    
    
}
