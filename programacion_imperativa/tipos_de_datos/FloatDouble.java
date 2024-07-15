package programacion_imperativa.tipos_de_datos;


public class FloatDouble{
    public static void main(String[] args){
        System.out.println("hola tema - Float y Doubles \n");


        /* float y double */

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("minFloat vale "+minFloat + " maxFloat vale "+maxFloat);

        float estatura = 1.75f;

        System.out.println("estatura vale: " + estatura + " metros");
        System.out.println(" o es lo mismo que: "+ (int)(estatura*100) + "cm");

        double numeroDouble = 30.5005; // si usamos 30.5005f se pierde precision y se corta a 30.50049...

        System.out.println(" numeroDouble con presicion vale: " + numeroDouble);

    }

}


