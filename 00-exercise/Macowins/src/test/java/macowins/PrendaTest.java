package macowins;

import org.junit.jupiter.api.Test;

import static macowins.TipoPrenda.CAMISA;
import static org.junit.jupiter.api.Assertions.*;

public class PrendaTest {

    @Test
    public void elTipoDeUnaCamisaNuevaEsCAMISA() {
        assertEquals(camisaNueva(200).getTipo().toString(), "CAMISA");
    }

    @Test
    public void elTipoDeUnSacoEnLiquidacionEsSACO() {
        assertEquals(sacoEnLiquidacion(200).getTipo().toString(), "SACO");
    }

    @Test
    public void elPrecioDeUnaCamisaNuevaEsSuPrecioBase() {
        assertEquals(camisaNueva(4000).precioVenta(), 4000, 0);
        assertEquals(camisaNueva(5000).precioVenta(), 5000, 0);
    }

    @Test
    public void elPrecioDeUnSacoEnLiquidacionEsSuLaMitadDeSuPrecioBase() {
        assertEquals(sacoEnLiquidacion(3000).precioVenta(), 1500, 0);
        assertEquals(sacoEnLiquidacion(8000).precioVenta(), 4000, 0);
    }

    @Test
    public void elPrecioDeUnPantalonEnPromocionEsSuPrecioBaseMenosSuDecuento() {
        assertEquals(pantalonEnPromocion(1500, 200).precioVenta(), 1300, 0);
        assertEquals(pantalonEnPromocion(1500, 100).precioVenta(), 1400, 0);
    }

    private Prenda pantalonEnPromocion(int precioBase, int descuento) {
        EstadoPrenda estado = new Promocion(descuento);
        TipoPrenda tipoPrenda = TipoPrenda.PANTALON;
        Prenda pantalon = new Prenda(precioBase, estado, tipoPrenda);

        return pantalon;
    }


    private Prenda camisaNueva(double precioBase) {
        EstadoPrenda estado = new Nueva();
        TipoPrenda tipoPrenda = TipoPrenda.CAMISA;
        Prenda camisa = new Prenda(precioBase, estado, tipoPrenda);

        return camisa;
    }

    private Prenda sacoEnLiquidacion(double precioBase) {
        EstadoPrenda estado = new Liquidacion();
        TipoPrenda tipoPrenda = TipoPrenda.SACO;
        Prenda saco = new Prenda(precioBase, estado, tipoPrenda);

        return saco;
    }
}