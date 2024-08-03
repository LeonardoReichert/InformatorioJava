package poo.tarea.Diagrama2Clase;


/*
 * resolver diagrama propuesto a java
 * 
 */


/*
 La salida de este programa es: 

La persona nace el dia: 2000-01-01
La persona es: Pedro
La persona tiene vehiculo: Toyota de 4 ruedas con alarma

 */



public class app {
    public static void main(String[] args) {
        

        Persona persona1 = new Persona(32211L, "Pedro", true);
        Vehiculo vehiculo1 = new Vehiculo("Toyota", 4, false, "1", "100");
        vehiculo1.setAlarma(true);
        //persona1.setDni(32112L);;
        persona1.setVehiculo(vehiculo1);

        System.out.println("La persona nace el dia: "+
            persona1.getFechaDeNacimiento());


        System.out.println("La persona es: "+
            persona1.getNombre());


        System.out.println("La persona tiene vehiculo: "+ persona1.getVehiculo());

    }
}
