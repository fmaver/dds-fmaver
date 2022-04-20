package macowins;

import java.util.Date;
import java.util.List;

public class Prenda {
    public double precioBase;
    public EstadoPrenda estado;
    public TipoPrenda tipoPrenda;

    Prenda(double precioBase, EstadoPrenda estado, TipoPrenda tipoPrenda){
        this.precioBase = precioBase;
        this.estado = estado;
        this.tipoPrenda = tipoPrenda;
    }

    double precioVenta(){
        return estado.precioFinal(precioBase);
    }

    public TipoPrenda getTipo() {
        return tipoPrenda;
    }
}

