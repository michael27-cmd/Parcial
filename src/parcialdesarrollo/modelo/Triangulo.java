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
public class Triangulo extends FiguraGeometrica{
    
    private static final String NOMBRE = "triangulo";
    private float base;
    private float altura;
    private float lado1;
    private float lado2;
    /**
     * 
     * @param base
     * @param lado1
     * @param lado2
     * @param area
     * @param perimetro 
     */
    public Triangulo(float base, float lado1, float lado2, float altura) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }
    
    @Override
    public float getPerimetro() {
        return lado1+lado2+base;
    }

    @Override
    public float getArea() {
        return (base*altura)/2;
    }

    @Override
    public String getNombre() {
        return NOMBRE;
    }

    @Override
    public String toString() {
        return "{\"Triangulo\":{" + "\"base\":" + base + ", \"altura\":" + altura + ", \"lado1\":" + lado1 + ", \"lado2\":" + lado2 + '}'+'}';
    }
    
    
}
