package poo.tarea.Diagrama2Clase;

public class Vehiculo {
    private String marca;
    private int cantidadDeRuedas;
    private String kmMinimo;
    private String kmMaximo;
    protected boolean competencia;
    protected boolean alarma;

    // constructores 
    public Vehiculo(String marca, int cantidadDeRuedas, boolean competencia, String kmMinimo, String kmMaximo){
        setMarca(marca);
        setCantidadDeRuedas(cantidadDeRuedas);
        setCompetencia(competencia);
        setKmMinimo(kmMinimo);
        setKmMaximo(kmMaximo);
    }

    public Vehiculo(String marca, int cantidadDeRuedas, boolean competencia, boolean alarma, String kmMaximo, String kmMinimo){
        setMarca(marca);
        setCantidadDeRuedas(cantidadDeRuedas);
        setCompetencia(competencia);
        setAlarma(alarma);
        setKmMinimo(kmMinimo);
        setKmMaximo(kmMaximo);
    }

    // comportamiento o responsabilidad
    public void mostrarPorPantallaMarca(){
        System.out.println("Marca: "+this.marca);
    }

    public void arrancarVehiculo(){
        System.out.println("El vehiculo "+ toString() +" arranca.");
    }


    // setters
    public void setMarca(String m) {
        marca = m;
    }

    public void setCantidadDeRuedas(int cantidad) {
        cantidadDeRuedas = cantidad;
    }

    public void setCompetencia(boolean val) {
        competencia = val;
    }

    public void setKmMinimo(String min) {
        kmMinimo = min;
    }

    public void setKmMaximo(String max) {
        kmMaximo = max;
    }
    
    public void setAlarma(boolean val) {
        alarma = val;
    }

    

    // getters
    public String getMarca() {
        return marca;
    }

    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }

    public boolean isAlarma(){
        return alarma;
    }

    public String getKmMinimo() {
        return kmMinimo;
    }

    public String getKmMaximo() {
        return kmMaximo;
    }

    @Override
    public String toString() {
        String msgAlarma = (alarma) ? "con alarma" : "sin alarma";
        return  getMarca() + " de " + getCantidadDeRuedas() + " ruedas "+msgAlarma;
    }

    
}
