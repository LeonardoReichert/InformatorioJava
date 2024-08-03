package poo.Clases;

public class Perro extends Animal{

    @Override
    public void caminar() {
        
        System.out.println("Perro "+nombre+" camina asi "+getPosicion()+" veces");
    }

    @Override
    public void hablar() {
        // TODO Auto-generated method stub
        System.out.println("Guau guau!");
        
    }

}
