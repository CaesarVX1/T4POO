/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4POOAvanzado;

/**
 *
 * @author cesar.valverde
 */
public class Empleado extends Persona {
    private String numeroCuenta, puesto;
    
    
    // Constructor
    public Empleado () { super(); }
    // Al tomar en cuenta que Empleado hereda los atributos de Persona, los añadimos en el constructor
    public Empleado (String nombre, String apellidos, String dni, String numeroCuenta, String puesto) { 
        super (nombre, apellidos, dni);
        this.numeroCuenta = numeroCuenta; 
        this.puesto = puesto;
        
    }
    
    // Getter
    public String getnumeroCuenta () { return numeroCuenta; }
    public String getPuesto () { return puesto; }
    
    
    
    
    //Setter
    public void setnumeroCuenta (String numeroCuenta) { this.numeroCuenta = numeroCuenta; }
    public void setPuesto (String puesto) { this.puesto = puesto; }
    
    
    // ToString
    @Override
    public String toString() { return super.toString() + ", númeroCuenta=" + this.numeroCuenta + ", puesto =" + this.puesto ;}
    
    
}
