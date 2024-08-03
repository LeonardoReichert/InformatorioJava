package poo.tarea.DiagramaFlotaVehiculos;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private int maxVehiculos;

    Flota(int maxVehiculos){
        setMaxVehiculos(maxVehiculos);
    }
    
    public boolean addVehiculo(Vehiculo v){
        if(vehiculos.size() >= this.maxVehiculos){
            return false;
        }
        vehiculos.add(v);
        v.setFlota(this);
        return true;
    }

    public boolean removeVehiculo(Vehiculo v){
        if (! vehiculos.contains(v)){
            return false;
        }
        vehiculos.remove(v);
        v.setFlota(null);
        return true;
    }

    public void MoverAVehiculo(Vehiculo v){
        System.out.println("Desde Flota movemos a vehiculo.");
        v.mover();
    }


    public void setMaxVehiculos(int newMax) {
        /* si nuevo valor es menor a la cantidad de la lista actual, entonces se remueve los vehiculos sobrantes */
        if ( newMax < 1 ){
            newMax = 1;
        }
        
        while ( newMax < vehiculos.size() ){
            Vehiculo v = vehiculos.removeLast();
            v.setFlota(null);
            System.out.println("Desde flota nos sobraban coches asi que removemos el ultimo: "+v);
        }
        maxVehiculos = newMax;
    }


}
