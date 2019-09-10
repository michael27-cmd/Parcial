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
public class Rectangulo extends FiguraGeometrica{
    
    private static final String NOMBRE = "rectangulo";
    private float base;
    private float altura;
    /**
     * 
     * @param base
     * @param altura
     * @param area
     * @param perimetro 
     */
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    

    @Override
    public float getPerimetro() {
        return (base*2)+(altura*2);
    }

    @Override
    public float getArea() {
        return base*altura;
    }
    @Override
    public String getNombre() {
        return NOMBRE;
    }

    @Override
    public String toString() {
        return "{\"Rectangulo\":{" + "\"base\":" + base + ", \"altura\":" + altura + '}'+'}';
    }
    
}
