package poo.tarea.DiagramaFlotaVehiculos;

public class Moto extends Vehiculo{
    

    Moto(String marca, String modelo, String patente){
        super(marca, modelo, patente);
    }

    public void mover() {
        System.out.println("Moto "+ this + " se mueve");
    }

}
