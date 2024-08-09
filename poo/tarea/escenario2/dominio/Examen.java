package escenario2.dominio;

import java.time.LocalDateTime;

public class Examen {
    private Curso curso;
    private Estudiante estudiante;
    private Double nota;
    private String descripcion;
    private LocalDateTime fechaExamen;

    Examen(Estudiante estudiante, Curso curso, LocalDateTime fechaExamen){
        setEstudiante(estudiante);
        setCurso(curso);
        setFechaExamen(fechaExamen);
    }
    Examen(Estudiante estudiante, Curso curso, Double nota, LocalDateTime fechaExamen){
        setEstudiante(estudiante);
        setCurso(curso);
        setFechaExamen(fechaExamen);
    }
    Examen(Estudiante estudiante, Curso curso, Double nota, String descripcion, LocalDateTime fechaExamen){
        setEstudiante(estudiante);
        setCurso(curso);
        setFechaExamen(fechaExamen);
        setNota(nota);
        setDescripcion(descripcion);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(LocalDateTime fechaExamen) {
        this.fechaExamen = fechaExamen;
    }
}
