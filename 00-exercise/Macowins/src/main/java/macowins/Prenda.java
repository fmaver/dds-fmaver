package macowins;

import java.util.Date;
import java.util.List;

public class Prenda {
    public double precioBase;
    public EstadoPrenda estado;
    public TipoPrenda tipo;

    Prenda(double precioBase, EstadoPrenda estado, TipoPrenda tipo){
        this.precioBase = precioBase;
        this.estado = estado;
        this.tipo = tipo;
    }

    double precioVenta(){
        return estado.precioFinal(precioBase);
    }
}

