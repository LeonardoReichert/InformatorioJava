package estructurada;

public class SwitchCase{
    public static void main(String[] args){
        System.out.println("hola condicional switchs");
        System.out.println("========= prueba de feriados ========\n");

        int dia = 4;
        System.out.println("prueba con valor dia="+dia);

        switch(dia){
            case 5:
            case 6:
                System.out.println("El dia "+dia+" es feriado");
                break;
            default:
                System.out.println("El dia "+dia+" no es feriado");
                break;
        }
        
    }
}