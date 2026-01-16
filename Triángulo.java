/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4POOAvanzado;

/**
 *
 * @author cesar.valverde
 */
public class Triángulo extends Poligono {
    private double lado1;
    private double lado2;
    private double lado3;
    
    

    // Constructor
    public Triángulo () {super();}
    public Triángulo (double lado1, double lado2, double lado3) {super(3); this.lado1 = lado1; this.lado2 = lado2; this.lado3 = lado3; }
    
    // Getter y Setters
    public double getLado1 (){return lado1;}
    public double getLado2 (){return lado2;}
    public double getLado3 (){return lado3;}
    
    public void setLado1 (double lado1){ this.lado1 = lado1;}
    public void setLado2 (double lado2){ this.lado2 = lado2;}
    public void setLado3 (double lado3){ this.lado3 = lado3;}

    // Métodos
    @Override
    public double area() {double p = (lado1+lado2+lado3)/2; return p; }
    @Override
    public double perimetro() {return lado1+lado2+lado3 ;}
    
    
    

}
