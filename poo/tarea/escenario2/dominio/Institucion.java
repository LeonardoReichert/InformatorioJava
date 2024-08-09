package escenario2.dominio;

import escenario2.enumeration.ComplejidadEnum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Institucion {
    private List<Curso> cursos = new ArrayList<Curso>();

    private Estudiante registrarEstudiante(){
        Estudiante estudianteNuevo = new Estudiante();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = sc.nextLine();
        sc.nextLine();
        estudianteNuevo.setNombre(nombreEstudiante);

        System.out.println("Ingrese el dni del estudiante: ");
        Long dni = sc.nextLong();
        estudianteNuevo.setDni(dni);
        sc.nextLine();

        System.out.println("Ingrese el año de nacimiento del estudiante: ");
        int anoDeNacimiento = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el mes de nacimiento del estudiante: ");
        int mesDeNacimiento = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el dia de nacimiento del estudiante: ");
        int diaDeNacimiento = sc.nextInt();
        sc.nextLine();

        LocalDate fechaDeNacimiento = LocalDate.of(anoDeNacimiento,mesDeNacimiento,diaDeNacimiento);
        estudianteNuevo.setFechaNacimiento(fechaDeNacimiento);

        return estudianteNuevo;
    }

    public void mostrarEstudiante(Long dniEstudiante){
        Estudiante estudiante = getEstudianteByDni(dniEstudiante);
        if(estudiante == null){
            System.out.println("No pudimos encontrar al estudiante.");
            return;
        }

        System.err.println(estudiante.getCursos().size() + " Cursos del estudiante "+ estudiante.getNombre());

        List<Examen> tempEstudianteExamenes = new ArrayList<Examen>();

        for(Curso curso: estudiante.getCursos()){

            for(Examen examen: curso.getExamenes()){
                if(examen.getEstudiante().equals(estudiante)){
                    tempEstudianteExamenes.add(examen);
                }
            }

            System.err.println("En "+curso.getNombre()+" tiene " + tempEstudianteExamenes.size() + " examenes este estudiante.");

            int indiceExamen = 0;
            for(Examen examen: tempEstudianteExamenes){
                
                System.out.println("Examen #"+(++indiceExamen) + " Fecha: "+ examen.getFechaExamen() );
                if (examen.getNota() != null){ 
                    System.out.println("  nota: "+examen.getNota());
                    System.out.println("  descripcion: "+examen.getDescripcion());
                }
                else{
                    System.out.println("  Sin nota aun ");
                }
                System.out.println("-------------------------------------------"); //nueva linea separadora de examenes
            }


            tempEstudianteExamenes.clear();
        
        }
        
        


    }

    public void inscribirEstudiante(UUID idCurso){
        Estudiante estudiante = registrarEstudiante();
        boolean existeCurso = Boolean.FALSE;

        for (Curso curso : this.cursos) {

            if ( curso.getId().equals(idCurso) ){
                //Encontramos el curso
                estudiante.getCursos().add(curso);
                curso.getEstudiantes().put(estudiante.getDni(),estudiante);
                existeCurso = Boolean.TRUE;

                break;
            }

        }

        if ( existeCurso ){
            System.out.println("Estudiante asignado al curso");
        }

    }

    public boolean inscribirEstudianteExistente(Long dniEstudiante, String nombreCurso){
        /*
         recibe dni de estudiante y nombre de curso, y si los encuentra
            entonces aadhiere al estudiante al curso tal
         si no se encuentra estudiante o curso devuelve false, devuelve true si todo salio bien
        */

        Curso cursoEncontrado = null;
        Estudiante estudianteEncontrado = null;
        boolean finded = false;


        for(Curso curso: this.cursos){
            
            if (cursoEncontrado==null && curso.getNombre().equalsIgnoreCase(nombreCurso) ){
                cursoEncontrado = curso;
            }

            for(Estudiante estudiante: curso.getEstudiantes().values()){
                if(estudiante.getDni().equals( dniEstudiante)){
                    estudianteEncontrado = estudiante;
                    break;
                }
            }

            finded = (estudianteEncontrado!=null && cursoEncontrado!=null);
            if (finded){
                break; // dejar de buscar porque ya encontramos curso y estudiante
            }
        }
    
        if (! finded ){
            return false; // al finalizar el for anterior, no encontramos estudiante y curso
        }

        // guardamos y devolvemos una respuesta true
        cursoEncontrado.getEstudiantes().put(dniEstudiante,estudianteEncontrado);
        estudianteEncontrado.getCursos().add(cursoEncontrado);
        return true;
    }


    public Curso crearCurso(){
        Curso nuevoCurso = new Curso();
        Scanner sc = new Scanner(System.in);

        nuevoCurso.setId( UUID.randomUUID() );

        System.out.println("Ingrese el nombre del curso:");
        String nombreCurso = sc.nextLine();
        sc.nextLine();
        nuevoCurso.setNombre( nombreCurso );

        System.out.println("Ingrese la complejidad del curso");
        System.out.println("1. Alta");
        System.out.println("2. Media");
        System.out.println("3. Baja");
        int complejidad = sc.nextInt();
        sc.nextLine();

//        switch(complejidad){
//            case 1:
//                nuevoCurso.setComplejidad(ComplejidadEnum.ALTA);
//                break;
//            case 2:
//                nuevoCurso.setComplejidad(ComplejidadEnum.MEDIA);
//                break;
//            case 3:
//                nuevoCurso.setComplejidad(ComplejidadEnum.BAJA);
//                break;
//            default:
//                nuevoCurso.setComplejidad(null);
//        }

        //JAVA 17 - SWITCH
        nuevoCurso.setComplejidad(
                switch (complejidad){
                    case 1 -> ComplejidadEnum.ALTA;
                    case 2 -> ComplejidadEnum.MEDIA;
                    case 3 -> ComplejidadEnum.BAJA;
                    default -> null;
                }
        );

        System.out.println("Ingrese cantidad de horas del curso: ");
        int horas = sc.nextInt();
        sc.nextLine();
        nuevoCurso.setCantidadHoras(horas);

        this.cursos.add(nuevoCurso);
        System.out.println("Curso creado satisfactoriamente");

        return nuevoCurso;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void listarCursos(){
        System.out.println("Lista de cursos disponibles");
        if(this.cursos.isEmpty()){
            System.out.println("No hay cursos todavia.");
            return;
        }
        for (Curso curso : this.cursos) {
            System.out.println(curso.toString());
        }
    }

    public void listarCursosYEstudiantes(){
        System.out.println(" ---------- CURSOS y ESTUDIANTES ---------- ");

        if(this.cursos.isEmpty()){
            System.out.println("No hay cursos todavia.");
            return;
        }

        for (Curso curso : this.cursos) {
            System.out.println("\n CURSO "+ curso.getNombre() + "\nESTUDIANTES: ");
            int index = 0;
            for(Estudiante estudiante: curso.getEstudiantes().values()){
                System.out.println("# "+(++index) + " "
                +estudiante.getNombre()+" "
                +estudiante.getDni()+" "
                +estudiante.getFechaNacimiento() );
            }
        }
        System.out.println(" ------------------------------------------- ");

    }

    public Estudiante getEstudianteByDni(Long dniBuscar){

        for(Curso curso: this.cursos){
            
            for(Estudiante estudiante: curso.getEstudiantes().values()){
                if(estudiante.getDni().equals( dniBuscar)){
                    return estudiante;
                }
            }

        }

        return null;
    }

    public Curso getCursoByName(String cursoName){
        for(Curso curso: this.cursos){
            if (curso.getNombre().equalsIgnoreCase(cursoName) ){
                return curso;
            }
        }
        return null;
    }

    public void crearExamen(Long dniEstudiante, String nombreCurso){
        Estudiante estudiante = getEstudianteByDni(dniEstudiante);
        if(estudiante==null){
            System.out.println("No se encuentra ese dni");
            return;
        }

        Curso curso = getCursoByName(nombreCurso);
        if(curso==null){
            System.out.println("No se encuentra ese curso");
            return;
        }

        
        Double notaExamen = null;
        String descExamen = null;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Desea asignar nota inicial al estudiante? [Y]");
        String ponerNota = scanner.nextLine();
        scanner.nextLine();
        if(ponerNota.equalsIgnoreCase("Y")){
            System.out.println("Ingresa la nota (decimal) del estudiante: ");
            notaExamen = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Ingresa la descripcion de nota: ");
            descExamen = scanner.nextLine();
            scanner.nextLine();
        }

        System.out.println("Ingresa fecha del examen: ");
        System.out.println("Anio: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Mes: ");
        int month = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Dia del mes: ");
        int day = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hora: ");
        int hs = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Minuto: ");
        int min = scanner.nextInt();
        
        scanner.nextLine();
        //scanner.close();
        
        LocalDateTime fechaExamen = LocalDateTime.of(year, month, day, hs, min);
        
        Examen examen = new Examen(estudiante, curso, notaExamen, descExamen, fechaExamen);
        
        curso.getExamenes().add(examen);

        System.out.println("El examen se anhiadio bien");

    }



}
