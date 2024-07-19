package estructurada;

public class SentenciasWhile{
    public static void main(String[] args){
        System.out.println("hola bucles while");

        int numero = 10;

        //uso de while
        while(numero-- > 0){
            System.out.println("while, Numero es "+numero);
        }

        numero = 10;

        //uso de Do-While, ejecutar almenos una vez
        do{
            System.out.println("do-while Numero es "+numero);
        }while(numero-- > 0);
        

    }
}