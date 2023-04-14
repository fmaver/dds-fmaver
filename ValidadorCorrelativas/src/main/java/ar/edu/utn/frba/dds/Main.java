package ar.edu.utn.frba.dds;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Creamos algunas materias
        Materia matematica = new Materia("Matemática");
        Materia programacion1 = new Materia("Programación 1", matematica);
        Materia programacion2 = new Materia("Programación 2", programacion1, matematica);
        Materia basesDeDatos = new Materia("Bases de Datos", programacion2);

        ArrayList<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(matematica);
        materiasAprobadas.add(programacion1);

        // Creamos un alumno y agregamos inscripciones
        Alumno juan = new Alumno("Juan", 1234, materiasAprobadas);
        //alumno.inscribirseA(matematica);
        //alumno.inscribirseA(programacion1);
        juan.inscribirseA(programacion2);
        juan.inscribirseA(basesDeDatos);

        // Validamos las correlativas de las inscripciones
        for (Inscripcion inscripcion : juan.getInscripcionMateria()) {
            if (inscripcion.inscripcionAprobada()) {
                System.out.println("La inscripción a " + inscripcion.getMateria().getNombre() + " es válida.");
            } else {
                System.out.println("La inscripción a " + inscripcion.getMateria().getNombre() + " no es válida.");
            }
        }
    }
}
