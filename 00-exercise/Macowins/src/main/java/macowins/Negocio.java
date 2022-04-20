package macowins;
import java.sql.Date;
import java.time.*;
import java.util.*;
import java.util.stream.Collectors;

public class Negocio {

    List<Venta> ventas = new ArrayList<>();
    Date fecha;

    public void registrarVenta(Venta nuevaVenta){
        ventas.add(nuevaVenta);
    }

    double gananicas(Date fecha){
        List<Venta> ventasDelDia = ventas.stream().filter(venta -> fueVendidoElDia(venta, fecha)).collect(Collectors.toList());

        return ventasDelDia.stream().mapToDouble(ventas -> ventas.precioFinal(ventas.medioDePago)).sum();
    }

    public boolean fueVendidoElDia(Venta venta, Date unDia){
        return venta.fecha == unDia;
    }

}
