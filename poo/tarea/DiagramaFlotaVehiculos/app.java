package poo.tarea.DiagramaFlotaVehiculos;

public class app {
    public static void main(String[] args) {
        System.out.println("Se crea una flota con cantidad maxima de 4 vehiculos.\n");

        Flota flota = new Flota(4);

        Vehiculo v1 = new Moto("Yamaha", "2009", "Ah62-Z");
        Vehiculo v2 = new Moto("Zanella", "2010", "Z3921k");
        Vehiculo v3 = new Coche("Chevrolet", "2021", "KL3322");
        Vehiculo v4 = new Coche("Ford", "2024", "9IIOP2");

        flota.addVehiculo(v1);
        flota.addVehiculo(v2);
        flota.addVehiculo(v3);
        flota.addVehiculo(v4);

        flota.MoverAVehiculo(v1);
        flota.MoverAVehiculo(v2);
        flota.MoverAVehiculo(v3);
        flota.MoverAVehiculo(v4);

        int maxVehiculo = 2;
        System.out.println("\n A continuacion se redimensionara la cantidad maxima de vehiculos de "+ flota.getMaxVehiculos() + " a " +maxVehiculo );

        flota.setMaxVehiculos(maxVehiculo);

        //flota.removeVehiculo(v1);

    }
}
