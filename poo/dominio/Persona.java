package poo.dominio;

public class Persona {
    String nombre;
    String apellido;
    int dni;
    int edad;

    public Persona(String nombre, String apellido, int dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }


    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public boolean setNombre(String val){
        if (! isNombreValid(val) ){
            System.out.println("No podemos settear un nombre vacio.");
            return false;
        }
        
        this.nombre = val;
        return true;
    }
    
    private boolean isNombreValid(String v){
        if (v.isEmpty()){
            return false;
        }

        return true;
    }


    public String getNombre(){
        return this.nombre;
    }


    @Override
    public String toString(){
        return this.nombre + " " + this.apellido + " (" + this.edad + ")";
    }

}




