/*

GUÍA TRABAJO PRÁCTICO Nº1 JAVA JEDI
Les presento la guía de trabajos prácticos opcionales, todos estos los pueden realizar
para obtener mayor práctica en el lenguaje.
Ejercicios nivel : Iniciado JAVA JEDI
1. Suma de dos números: Se le solicita que guarden dos números enteros y los
sumen. El resultado mostrarlo por pantalla.
2. Suma de dos números bis: Se les solicita que guarden dos números enteros y los
sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
indique si se trata de un número par o impar.
El mensaje debe tener el siguiente formato:
“El resultado es “ {Resultado} “y es” {paridad}
3. Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
4. Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
sumen, determine si el primer número es divisible por el segundo número y muestre
el resultado.
5. Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola.
6. Nombre de bebida: Se le solicita que guarde en espacios de memoria distinta la
información de: El nombre de su última mascota y nombre de la última película
vista. Por último mostrarlo por pantalla con el siguiente formato:
“Nombre de la próxima bebida : ” {Nombre de mascota} {Nombre de pelicula}
7. Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
real? ¿Por qué?
8. Mi nombre y edad: Se le solicita que guarde en un espacio de memoria su nombre
y apellido, luego guarde su edad e imprimalos por pantalla.



 */


package programacion_imperativa.ejercicios.nivel_iniciado;
import java.util.Scanner;


public class JavaJedi {
    public static void main(String[] args){
    /*
    Suma de dos números bis: Se les solicita que guarden dos números enteros y los
    sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
    indique si se trata de un número par o impar.
     */

    int n1 = 8;
    int n2 = 4;
    int suma = n1 + n2;
    String resMsg = (suma%2==0) ? "par": "impar";

    System.out.println("El resultado de suma es "+suma+" y es "+resMsg);
    
    /*
     3. Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
    y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
     */
    
    String strMyName = "Leonardo";
    
    char chFirstName = 'L';   //"Leo"
    char chMiddleName = 'A';  //"Adrian"
    char chLastName = 'R';    //"Reichert"

    System.out.println("Mi letra primera es "+chFirstName+" la segunda es "+chMiddleName+" y la ultima es "+chLastName);
    
    /* 4. Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
    sumen, determine si el primer número es divisible por el segundo número y muestre
    el resultado. */


    
    System.out.println("Teniendo n1="+n1+" y n2="+n2+" se calculara la divisibilidad n1/n2:");
    //la suma ya esta hecha
    String strIsDivisible = (n1%n2==0) ? "divisible":"indivisible";
    System.out.println("es: "+strIsDivisible);

    /*
     5. Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
    triángulo de asteriscos en la consola.
        */

    System.out.println("\ndibujado un cuadrado con programacion imperativa (sin estructuras iterativas):");
    System.out.println("*******\n*****\n***\n*");

    /*
     6. Nombre de bebida: Se le solicita que guarde en espacios de memoria distinta la
    información de: El nombre de su última mascota y nombre de la última película
    vista. Por último mostrarlo por pantalla con el siguiente formato:
    “Nombre de la próxima bebida : ” {Nombre de mascota} {Nombre de pelicula}
     */


    System.out.println("\n - A continuacion se pedira nombre de mascota y pelicula y se mostrara por pantalla - ");
    Scanner scanner1 = new Scanner(System.in);

    System.out.println("Ingresa el nombre de tu mascota: ");
    String strLastMascota = scanner1.nextLine();
    
    System.out.println("Ingresa el nombre de una pelicula: ");
    String strLastMovie = scanner1.nextLine();
    

    System.out.println("Nombre de la proxima bebida: {"+strLastMascota+"} {"+strLastMovie+"}");

    /*
    7. Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
    guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
    memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
    real? ¿Por qué?
    */

    double r1=2.0, r2=3.5;
    int e1=6, e2=8;
    
    double suma_real = r1*r2 + e1*e2;
    System.out.println("suma real es: "+ suma_real);
    System.out.println("Por la promocion de precision o del mayor de tamanio la suma resulta ser real");

    /* 8. Mi nombre y edad: Se le solicita que guarde en un espacio de memoria su nombre
        y apellido, luego guarde su edad e imprimalos por pantalla.
     */

    System.out.println("\nA continuacion este programa le pedira su nombre, apellido y edad y los mostrara por pantalla...");

    System.out.println("Nombre: ");
    String strName = scanner1.nextLine();
    
    System.out.println("Apellido: ");
    String strLastname = scanner1.nextLine();
    
    System.out.println("Edad: ");
    int intAge = scanner1.nextInt();
    
    System.out.println(" nombre, apellido y edad: "+strName+" "+strLastname+" (" + intAge + ")");

    scanner1.close();
    }
    
}
