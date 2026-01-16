/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4POOAvanzado;

/**
 *
 * @author cesar.valverde
 */
public class Persona {
    private String dni, nombre, apellidos;
    
    // Constructor
    public Persona () {}
    public Persona (String nombre, String apellidos, String dni) {this.nombre = nombre; this.apellidos = apellidos; this.dni = dni;}
    
    
    // Getters
    public String getDNI() { return dni; }
    public String getNombre () { return nombre; }
    public String getApellidos() {return apellidos;}
    
    
    
    // Setters
    public void setDNI (String dni) { this.dni = dni; }
    public void setNombre (String nombre) { this.nombre = nombre; }
    public void setApellidos (String apellidos) { this.apellidos = apellidos; }
    
    // Método especial
    public String getNombreCompleto() { return nombre + " " + apellidos; }

    // Códificación J-Son
    public String toString() {
        return "nombre=" + this.nombre + ", apellidos = " + apellidos + ", " + " dni = " + dni;
    }
}
