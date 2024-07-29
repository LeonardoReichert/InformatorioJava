package poo;

import poo.dominio.Persona;

public class app {
    public static void main(String[] args) {
        
    
    Persona persona = new Persona("Leonardo", "Reichert", 389999, 29);

    Persona persona2 = new Persona("Edmundo", "Gonzales");

    //persona.setNombre("Leonardo");

    System.out.println("El nombre es: "+persona.getNombre());
    System.out.println("El nombre2 es: "+persona2.getNombre());
    

    System.out.println("representacion: " + persona2);
    }
}
