package poo.tarea.DiagramaFlotaVehiculos;

public class Coche extends Vehiculo {

    Coche(String marca, String modelo, String patente){
        super(marca, modelo, patente);
    }

    public void mover(){
        System.out.println("Auto "+ this + " se mueve");
    }


}
