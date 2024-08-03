package poo.tarea.DiagramaFlotaVehiculos;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private int maxVehiculos;

    Flota(int maxVehiculos){
        setMaxVehiculos(maxVehiculos);
    }
    

    public void moverAVehiculo(Vehiculo v){
        System.out.println("Desde Flota movemos a vehiculo:");
        v.mover();
    }

    public void moverTodosLosVehiculos(){
        for(int i=0; i<vehiculos.size(); i++){
            vehiculos.get(i).mover();
        }
    }


    public boolean addVehiculo(Vehiculo v){
        if(vehiculos.size() >= this.maxVehiculos){
            System.out.println("No se pudo aniadir el vehiculo "+v+" porque la flota esta llena.");
            return false;
        }
        vehiculos.add(v);
        v.setFlota(this);
        System.out.println("Se aniadio "+v+" a flota");
        return true;
    }

    public boolean removeVehiculo(Vehiculo v){
        if (! vehiculos.contains(v)){
            System.out.println("No se pude remover vehiculo "+v+" porque no esta en la flota");
            return false;
        }
        vehiculos.remove(v);
        v.setFlota(null);
        return true;
    }

    // Setters

    public void setMaxVehiculos(int newMax) {
        /* si nuevo valor es menor a la cantidad de la lista actual, entonces se remueve los vehiculos sobrantes */
        if ( newMax < 1 ){
            newMax = 1;
        }
        
        while ( newMax < vehiculos.size() ){
            Vehiculo v = vehiculos.removeLast();
            v.setFlota(null);
            System.out.println("Desde flota nos sobraban vehiculos asi que removemos el ultimo: "+v);
        }
        maxVehiculos = newMax;
    }


    // Getters

    public int getMaxVehiculos() {
        return maxVehiculos;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

}
