package macowins;

import org.junit.jupiter.api.Test;
//import java.sql.Date;
import java.util.Date;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class VentaTest {

    @Test
    public void elImporteDeUnaCamisaNuevaYUnPantalonEnPromoEsLaSumaDeSusPrecios(){
        assertEquals(camisaNuevaYPantalonEnPromo(200, 300).importe(),500);
    }

    @Test
    void precioFinal() {
    }


    private Venta camisaNuevaYPantalonEnPromo(double precioCamisa, double precioPantalon){
        MedioDePago efectivo = new PagoEfectivo();
        Date fecha = new Date();
        Prenda Pantalon = pantalonEnPromocion(precioPantalon, 0);
        Prenda Camisa = camisaNueva(200);

        List<Prenda> listaDePrendas = Arrays.asList(Pantalon, Camisa);

        return new Venta(listaDePrendas, fecha, efectivo);
    }

    private Prenda pantalonEnPromocion(double precioBase, double descuento) {
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


