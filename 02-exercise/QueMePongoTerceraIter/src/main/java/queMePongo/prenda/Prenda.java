package queMePongo.prenda;

import queMePongo.material.Material;

import java.awt.*;
import static java.util.Objects.requireNonNull;

public class Prenda {
    TipoPrenda tipo;
    public Categoria categoria;
    Material material;
    Color colorPrincipal;
    Color colorSecundario;

    public Prenda(TipoPrenda tipo, Categoria categoria,Material material,  Color colorPrincipal, Color colorSecundario) {

        this.tipo = requireNonNull(tipo, "Type is mandatory");
        this.categoria = requireNonNull(categoria, "Cattegory is needed");
        this.colorPrincipal = requireNonNull(colorPrincipal, "Principal color is mandatory");
        this.colorSecundario = colorSecundario;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }

    public static class PrendaInvalidaException extends RuntimeException {
        public PrendaInvalidaException(String causa) {
            super("La prenda es inválida porque " + causa);
        }
    }

}


