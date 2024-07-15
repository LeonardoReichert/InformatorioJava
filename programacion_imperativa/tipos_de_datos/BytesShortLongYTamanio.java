package programacion_imperativa.tipos_de_datos;


public class BytesShortLongYTamanio{
    public static void main(String[] args){
        System.out.println("hola tema tipos de datos\n");

        // imprime minimo -128 y maximo 127
        System.out.println("minimo de byte "+Byte.MIN_VALUE);
        System.out.println("maximo de byte "+Byte.MAX_VALUE);

        // primitivos de byte:
        byte minByte = -128;
        byte maxByte = 127; // segun pruebas asignarle un 128 da error


        // imprime minimo -32768 y maximo 32767
        System.out.println("\nminimo de Short "+Short.MIN_VALUE);
        System.out.println("maximo de Short "+Short.MAX_VALUE);

        // primitivos de short 16bits:
        short minShort = -32768;
        short maxShort = 32767; // da error si asignamos 32768

        System.out.println("minShort vale "+minShort + " maxShort vale "+maxShort+ "\n");


        // imprime
        // minimo de Integer -2147483648
        // maximo de Integer 2147483647
        System.out.println("\nminimo de Integer "+Integer.MIN_VALUE);
        System.out.println("maximo de Integer "+Integer.MAX_VALUE);

        int minInteger = -2147483648;
        int maxInteger = 2147483647; // +1 da error

        System.out.println("minInteger vale "+minInteger + " maxInteger vale "+maxInteger + "\n");



        // imprime
        // minimo de Long -9223372036854775808
        // maximo de Long 9223372036854775807
        System.out.println("\nminimo de Long "+Long.MIN_VALUE);
        System.out.println("maximo de Long "+Long.MAX_VALUE);

        //este uso de numeros sin la letra L da error porque es usar un integer literal sin L
        long minLong = -9223372036854775808L;
        long maxLong = 9223372036854775807L;

        System.out.println("minLong vale "+minLong + " maxLong vale "+maxLong + "\n");


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


