package escenario2;

import escenario2.dominio.Curso;
import escenario2.dominio.Institucion;

import java.util.Scanner;
import java.util.UUID;

public class App {
    public static void main(String[] args) {
        Institucion institucion = new Institucion();
        int opcion;
        Scanner scanner = new Scanner(System.in);

        Long dniEstudiante;
        String nombreCurso;


        do {
            System.out.println("Ingrese opcion : \n");
            System.out.println("1. Crear curso");
            System.out.println("2. Registrar estudiante nuevo");
            System.out.println("3. Registrar un estudiante existente");
            System.out.println("4. Listar cursos");
            System.out.println("5. Listar cursos y estudiantes");
            System.out.println("6. Cargar examen a estudiante");
            System.out.println("7. Mostrar informacion de estudiante (cursos, examenes)");
            System.out.println("8. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    Curso cursoCreado = institucion.crearCurso();
                    System.err.println("ID de curso nuevo: "+cursoCreado.getId());
                    break;
                case 2:
                    System.out.println("Ingrese id de curso");
                    String idCurso = scanner.nextLine();
                    scanner.nextLine();
                    institucion.inscribirEstudiante(UUID.fromString(idCurso));
                    break;
                case 3:
                    //Funcionalidad registrar un estudiante existente
                    System.out.println("Ingresa dni de estudiante: ");
                    dniEstudiante = scanner.nextLong();
                    scanner.nextLine();
                    System.out.println("Ingresa nombre de curso: ");
                    nombreCurso = scanner.nextLine();
                    scanner.nextLine();
                    boolean succes = institucion.inscribirEstudianteExistente(dniEstudiante, nombreCurso);
                    if (succes){
                        System.out.println("El estudiante se registro correctamente.");
                    }
                    else{
                        System.out.println("El estudiante no pudo registrarse, asegurate de escribir bien los datos.");
                    }
                    break;
                case 4:
                    institucion.listarCursos();
                    break;
                case 5:
                    //Listar cursos y estudiantes
                    institucion.listarCursosYEstudiantes();
                    break;
                case 6:
                    // func crear examen
                    System.out.println("Ingresa dni de estudiante: ");
                    dniEstudiante = scanner.nextLong();
                    scanner.nextLine();

                    System.out.println("Ingresa nombre de curso: ");
                    nombreCurso = scanner.nextLine();
                    scanner.nextLine();

                    institucion.crearExamen(dniEstudiante, nombreCurso);
                    break;
                case 7:
                    // mostrar infomacion de estudiante, cursos examenes
                    System.out.println("Ingresa dni de estudiante: ");
                    dniEstudiante = scanner.nextLong();
                    scanner.nextLine();

                    institucion.mostrarEstudiante(dniEstudiante);
                    break;
                case 8:
                    System.out.println("\n Aplicacion finalizada");
                    break;
                default:
                    break;
            }

        }while (opcion != 8);



        scanner.close();
    }
}
