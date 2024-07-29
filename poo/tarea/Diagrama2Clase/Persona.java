package poo.tarea.Diagrama2Clase;

import java.time.LocalDate;



public class Persona {
    private Long dni;
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private Vehiculo vehiculo;


    // constructores (inicializadores)
    public Persona(){
        setFechaDeNacimiento(null);
    }

    public Persona(Long dni, String nombre, boolean licencia ){
        setDni(dni);
        setNombre(nombre);
        setFechaDeNacimiento(null);
    }


    // setters
    public void setNombre(String val) {
        nombre = val;
    }


    public void setDni(Long val) {
        dni = val;
    }
    
    public void setFechaDeNacimiento(LocalDate date) {
        if ( date == null ){
            date = LocalDate.of(2000, 1, 1);
        }
        fechaDeNacimiento = date;
    }

    public void setVehiculo(Vehiculo v) {
        vehiculo = v;
    }

    // getters
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Long getDni() {
        return dni;
    }



}
