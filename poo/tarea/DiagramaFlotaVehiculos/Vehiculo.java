package poo.tarea.DiagramaFlotaVehiculos;


abstract public class Vehiculo {
    private String marca;
    private String modelo;
    private String patente;
    private Flota flota;


    Vehiculo(String marca, String modelo, String patente){
        setMarca(marca);
        setModelo(modelo);
        setPatente(patente);
    }

    abstract public void mover();

    // Setters
    public void setFlota(Flota f){
        flota = f;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public void setModelo(String m) {
        modelo = m;
    }

    public void setPatente(String p) {
        patente = p;
    }


    // Getters
    public Flota getFlota(){
        return flota;
    };

    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public String toString() {
        return "<"+getMarca() + " " + getModelo() + " patente: "+getPatente()+">";
    }

}
