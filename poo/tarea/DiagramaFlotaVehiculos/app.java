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

        System.out.println("\nA continuacion se mueven todos los Vehiculos en flota.");
        flota.moverTodosLosVehiculos();

        int maxVehiculo = 2;
        System.out.println("\n A continuacion se redimensionara la cantidad maxima de vehiculos de "+ flota.getMaxVehiculos() + " a " +maxVehiculo );

        flota.setMaxVehiculos(maxVehiculo);

        //flota.removeVehiculo(v1);

        System.out.println("\nA continuacion se mueven todos los Vehiculos en flota.");
        flota.moverTodosLosVehiculos();

    }
}


/*
 resultado de la ejecucion: 
Se crea una flota con cantidad maxima de 4 vehiculos.

Se aniadio <Yamaha 2009 patente: Ah62-Z> a flota
Se aniadio <Zanella 2010 patente: Z3921k> a flota     
Se aniadio <Chevrolet 2021 patente: KL3322> a flota   
Se aniadio <Ford 2024 patente: 9IIOP2> a flota        

A continuacion se mueven todos los Vehiculos en flota.
Moto <Yamaha 2009 patente: Ah62-Z> se mueve
Moto <Zanella 2010 patente: Z3921k> se mueve
Auto <Chevrolet 2021 patente: KL3322> se mueve        
Auto <Ford 2024 patente: 9IIOP2> se mueve

 A continuacion se redimensionara la cantidad maxima de vehiculos de 4 a 2
Desde flota nos sobraban vehiculos asi que removemos el ultimo: <Ford 2024 patente: 9IIOP2>     
Desde flota nos sobraban vehiculos asi que removemos el ultimo: <Chevrolet 2021 patente: KL3322>

A continuacion se mueven todos los Vehiculos en flota.
Moto <Yamaha 2009 patente: Ah62-Z> se mueve
Moto <Zanella 2010 patente: Z3921k> se mueve

 */