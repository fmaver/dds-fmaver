package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre, Materia... correlativas) {
        this.nombre = nombre;
        this.correlativas = Arrays.asList(correlativas);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void agregarCorrelativa(Materia materia) {
        correlativas.add(materia);
    }


}
