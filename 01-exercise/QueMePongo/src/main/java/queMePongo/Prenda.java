package queMePongo;

import java.awt.*;
import java.util.Date;
import java.util.List;

public class Prenda {
    String tipo;
    Categoria categoria;
    Material material;
    Color colorPrincipal;
    Color colorSecundario;

    String getTipo(){
        return tipo;
    }
    Categoria getCategoria(){
        return categoria;
    }
    Material getMaterial(){
        return material;
    }
    Color getColorPrincipal(){
        return colorPrincipal;
    }
    Color getColorSecundario(){
        return colorSecundario;
    }

}

