/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4POOAvanzado;

/**
 *
 * @author cesar.valverde
 */
public class Estudiante extends Persona {
    private String nivel, centro;
    private int curso, nre;
    
    // Constructor
    public Estudiante () { super();}
    public Estudiante (String nombre, String apellidos, String dni, String nivel, int curso, int nre, String centro) { 
        super (nombre, apellidos, dni);
        this.nivel = nivel; this.curso = curso; this.nre = nre; this.centro = centro;} // Fin Constructor
    
    // Getters
    public String getNivel () { return nivel; }
    public int getCurso () { return curso; }
    public int getNRE () { return nre; }
    public String getCentro () { return centro; }
    
    // Setters
    public void setNivel (String nivel) {this.nivel = nivel;}
    public void setCurso (int curso) {this.curso = curso;}
    public void setNRE (int nre) {this.nre = nre ;}
    public void setCentro (String centro) {this.centro = centro ;}
    
    @Override
    public String toString() { return super.toString() + ", nivel=" + this.nivel + ", curso =" + this.curso + ", centro =" + this.centro + ", nre =" + this.centro ;}
        
}
