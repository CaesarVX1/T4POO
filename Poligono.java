/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4POOAvanzado;

/**
 *
 * @author cesar.valverde
 */
public abstract class Poligono {
    private int numLados;
    
    // Constructores
    public Poligono (){}
    public Poligono (int numLados){this.numLados = numLados;}
    
    // Getters y Setters
    public int getNumLados(){ return this.numLados;}
    public void setNumLados(){this.numLados = numLados;}

    // Métodos
    public abstract double area();
    public abstract double perimetro();
    
    
    
}
