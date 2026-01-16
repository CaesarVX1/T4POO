/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4POOAvanzado;

import java.util.Arrays;

/**
 *
 * @author cesar.valverde
 */
public class Docente extends Persona {
    private String modulo []; 
    private String centro;
    private int nrp;
    
    // Constructores
    public Docente () { super ();}
    public Docente (String nombre, String apellidos, String dni, String modulo[], int nrp, String centro) { 
        super (nombre, apellidos, dni);
        this.modulo = modulo; this.nrp = nrp; this.centro = centro;} // Fin Constructor
    
    // Getters
    public String[] getModulo () { return modulo; }
    public int getNRP () { return nrp; }
    public String getCentro () { return centro; }
    
    
    // Setters
    public void setModulo (String modulo[]) {this.modulo = modulo ;}
    public void setNRP (int nrp) {this.nrp = nrp ;}
    public void setCentro (String centro) {this.centro = centro ;}
    
    // Método especial
    @Override
    public String getNombreCompleto () {return super.getApellidos() + ", " + super.getNombre();}
    
    
    @Override
    public String toString() { return super.toString() + ", módulo=" + Arrays.toString(this.modulo) + ", nrp =" + this.nrp + ", centro =" + this.centro ;}
    
}
