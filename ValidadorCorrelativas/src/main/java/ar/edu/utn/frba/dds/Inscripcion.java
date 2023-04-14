package ar.edu.utn.frba.dds;

import java.util.ArrayList;

public class Inscripcion {
    private Materia materia;
    private Alumno alumno;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.materia = materia;
        this.alumno = alumno;
    }


    public Materia getMateria() {
        return materia;
    }

    public boolean inscripcionAprobada() {
        return this.materia.getCorrelativas().containsAll(this.alumno.getMateriasAprobadas());
    }
}

