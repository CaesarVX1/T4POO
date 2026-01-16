/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema4POOAvanzado;

/**
 *
 * @author cesar.valverde
 */
public class PruebaPersonaEmpleado {
    public static void main(String[] args) {
        
    Empleado e1 = new Empleado();
    e1.getNombreCompleto();
    
    Persona p1 = new Persona();
    p1.getNombreCompleto();
    
    Estudiante es1 = new Estudiante();
    Docente d1 = new Docente();
    
    Persona p2 = new Persona ("Juan", "Pérez", "11111111T");
    Empleado e2 = new Empleado("Carlos", "Martínez", "22222222L", "IBAN XXXX1", "Electricists");
    Estudiante es2 = new Estudiante("Carlota", "Arana", "12121212A", "FP", 1, 123456, "IES RAMON ARCAS");
    
    String [] modulo = {"Programación", "Ingenieria"};
    Docente d2 = new Docente("Alaro", "Sanchez", "11221122A", modulo, 222222, "IES blablabla");
    
    System.out.println("Apellido: " + p2.getApellidos());
    System.out.println("Apellido: " + e2.getApellidos());
    System.out.println("Apellido: " + es2.getApellidos());
    System.out.println("Apellido: " + d2.getApellidos());
    System.out.println("Número cuenta: " + e2.getnumeroCuenta());
    System.out.println("Nivel: " + es2.getNivel());
    System.out.println("Centro: " + d2.getCentro());
    
    System.out.println("");
    
    System.out.println("Nombre completo: (Persona) " + p2.getNombreCompleto());
    System.out.println("Nombre completo: (Estudiante) " + es2.getNombreCompleto());
    System.out.println("Nombre completo: (Empleado) " + e2.getNombreCompleto());
    System.out.println("Nombre completo: (Docente) " + d2.getNombreCompleto());
    
    System.out.println("toString (Persona): " + p2.toString());
    System.out.println("toString (Persona): " + e2.toString());
    System.out.println("toString (Persona): " + es2.toString());
    System.out.println("toString (Persona): " + d2.toString());
    

    // Espacios para separar el código y sea legible
        System.err.println(" ");
        System.err.println(" ");
        System.err.println(" ");
        System.err.println(" ");
        System.err.println(" ");
    // ToString overrideado
        System.out.println(e2.toString());
    
    
    
    Persona persona [] = new Persona [8];
    persona[0] = p1;
    persona[1] = p2;
    persona[2] = es1;
    persona[3] = es2;
    persona[4] = d1;
    persona[5] = d2;
    persona[6] = e1;
    persona[7] = e2;
    
    Persona p3 = new Persona ("Pepa", "Ortiz", "55555555T");
    Estudiante es3 = new Estudiante ("Antonio", "Gimenez", "66666666F", "Bachillerato", 2, 4567123, "IES RAMON ARCAS");
    
    p3 = es3;
    
    Persona p4 = new Empleado ("Alejandra", "Marín", "88888888G", "ES032283462397469236", "Electricista" );
    
    System.err.println("");
    System.err.println("toString (Persona - p3: " + p3.toString());
    
    
    // Operador InstanceOf
    int CountEstudiante = 0, CountEmpleado = 0, CountDocente = 0, CountPersona =0;
    for (int i = 0; i<persona.length; i++) {
        if (persona[i] instanceof Estudiante); CountEstudiante++;
        if (persona[i] instanceof Empleado); CountEmpleado++;
        if (persona[i] instanceof Docente); CountDocente++;
        if (persona[i] instanceof Persona); CountPersona++;
    } //Fin bucle
    
        System.out.println("");
        System.out.println("Count Estudiante: " + CountEstudiante);
        System.out.println("Count Empleado: " + CountEmpleado);
        System.out.println("Count Docente: " + CountDocente);
        System.out.println("Count Persona: " + CountPersona);
        
     
        
    
    }
}
