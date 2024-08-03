package poo.Clases;

public abstract class Animal {
    
    protected String nombre;
    private int posicion;

    protected int getPosicion(){
        return posicion;
    }

    abstract public void hablar();

    public void caminar(){
        posicion++;
        System.out.println("Animal "+nombre +" camina "+posicion+" veces.");
    }

    public void setNombre(String nombre) {
        System.out.println("Nuevo nombre para animal "+nombre);
        this.nombre = nombre;
    }

}
