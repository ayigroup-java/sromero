package dominio;

import faces.AccionesAcademicas;

import java.util.StringJoiner;

public class Ingresante extends Persona implements AccionesAcademicas {

    private String materia;
    private String carrera;

    public Ingresante(){
        super();
    }

    public Ingresante(String materia, String carrera) {
        this();
        this.materia = materia;
        this.carrera = carrera;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String defineOrganización() {
        return "Universidad";
    }

    @Override
    public Boolean setActive() {
        return true;
    }

    @Override
    public String inscripcionMateria(String materia) {
        return this.materia = "ingresante:" + materia;
    }

    @Override
    public String inscripcionCarrera(String carrera) {
        return this.carrera = "ingresante:" + carrera;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ingresante.class.getSimpleName() + "[", "]")
                .add("materia='" + materia + "'")
                .add("carrera='" + carrera + "'")
                .add("id=" + id)
                .add("active=" + active)
                .toString();
    }
}
