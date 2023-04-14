package ar.edu.utn.frba.dds;

import java.util.ArrayList;

public class Alumno {
    String nombre;
    int legajo;
    ArrayList<Inscripcion> inscripcionMateria;
    ArrayList<Materia> materiasAprobadas;

    public Alumno(String nombre, int legajo, ArrayList<Materia>materiasAprobadas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.inscripcionMateria = new ArrayList<>();
        this.materiasAprobadas = materiasAprobadas;
    }

    public void agregarMateriaAprobada(Materia materia) {
        materiasAprobadas.add(materia);
    }

    public ArrayList<Inscripcion> getInscripcionMateria() {
        return inscripcionMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public ArrayList<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void inscribirseA(Materia materia) {
        Inscripcion inscripcion = new Inscripcion(this, materia);
        inscripcionMateria.add(inscripcion);
    }

    public boolean tieneAprobado(Materia materia) {
        return materiasAprobadas.contains(materia);
    }

}
