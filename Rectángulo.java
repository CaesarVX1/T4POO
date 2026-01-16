/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4POOAvanzado;

/**
 *
 * @author cesar.valverde
 */
public class Rectángulo extends Poligono {
    private double lado1;
    private double lado2;
    
    public Rectángulo(){}
    public Rectángulo(double lado1, double lado2){ super(2); this.lado1 = lado1; this.lado2 = lado2;}

    // Getters y Setters
    public double getLado1 (){return this.lado1;}
    public double getLado2 (){return this.lado2;}
    
    public void setLado1(double lado1) {this.lado1 = lado1;}
    public void setLado2(double lado2) {this.lado2 = lado2;}
    
    // Métodos
    @Override
    public double area() {return lado1*lado2;}
    @Override
    public double perimetro() {return 2*(lado1+lado2) ;}
    
} // Fin Rectángulo
