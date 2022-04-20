package macowins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoPrendaTest {

    EstadoPrenda estado;

    @Test
    void elPrecioDeElEstadoNuevoEsSuPrecioOriginal() {
        estado = new Nueva();
        double precioOriginal = 50;
        Assertions.assertEquals(precioOriginal, estado.precioFinal(precioOriginal));
    }

    @Test
    void elPrecioDeElEstadoLiquidacionEsSuPrecioOriginalCon50Descuento() {
        estado = new Liquidacion();
        double precioOriginal = 50;
        Assertions.assertEquals(precioOriginal/2, estado.precioFinal(precioOriginal));
    }

    @Test
    void elPrecioDeElEstadoPromocionEsSuPrecioOriginalConDescuento() {
        estado = new Promocion(10);
        double precioOriginal = 50;
        double descuento = 10;
        Assertions.assertEquals(precioOriginal-descuento, estado.precioFinal(precioOriginal));
    }

}