package arreglos;


/*
Desafio 2 : Dado un arreglo 3x3, desarrollar un programa que sume los elementos en diagonal y
            por ultimo muestre la sumatotal de la suma.
Desafio 3 : Dado un arreglo de N posiciones,
    desarrollar un programa en java que tome el primer mejor valor y el segundo mejor valor.
    Mostrar por pantalla las posicions de estos dos mejores valores junto con su valor.
*/

public class Desafios {
    public static void main(String[] args) {

    // desafio 2:
    int[][] enteros = {
                        {2,3,4,5,6}, 
                        {3,4,6,8,8}, 
                        {10,23,33,11,12},
                        {34,6,7,8,81},
                        {3,4,1,1,2},
                     };

    int suma = 0;
    int x = 0;
    for(int y=0; y<enteros.length  &&  x < enteros[y].length; y++){

        // se crea un alias o apuntador a
        //int[] yEnteros = enteros[y];

        suma += enteros[y][x];
        System.out.println("Se toma en ("+x+","+y+") el num "+enteros[y][x]);
        
        x++;
    }

    System.out.println("La suma total es "+suma);


    //desafio 3
    System.out.println("\n - Mejor valor - ");
    System.out.println(" Este programa buscara 2 numeros enteros mejores o mas altos");


    int[] enterosN = {3,2,41,5,152,2,32,3,52,1,3222,5,6,7,8};
    
    int res1, indexRes1, res2, indexRes2;
    // estos numeros comienzan siendo el primero
    res1 = res2 = enterosN[0];


    // buscamos el primer mejor
    int i = indexRes1 = indexRes2 = 0;
    for(; i<enterosN.length; i++){
        if(enterosN[i] > res1){
            res1 = enterosN[i];
            indexRes1 = i;
            break;
        }
    }

    // el segundo mejor
    res2 = res1;
    indexRes2 = indexRes1;

    for(; i<enterosN.length; i++){
        if(enterosN[i] > res2){
            res2 = enterosN[i];
            indexRes2 = i;
            break;
        }
    }

    System.out.println("indice del primer mejor: "+indexRes1);
    System.out.println("su valor es: "+res1);

    System.out.println("\nindice del segundo mejor: "+indexRes2);
    System.out.println("su valor es: "+res2);
}
}
