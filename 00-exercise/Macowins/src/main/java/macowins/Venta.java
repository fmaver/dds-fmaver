package macowins;

//mport java.sql.Date;
import java.util.*;

class Venta {
   List<Prenda> listaDePrendas;
   Date fecha;
   MedioDePago medioDePago;

   Venta(List<Prenda> listaDePrendas, Date fecha, MedioDePago medioDePago){
       this.medioDePago = medioDePago;
       this.fecha = fecha;
       this.listaDePrendas = listaDePrendas;
   }
    double importe() {
        return listaDePrendas.stream().mapToDouble(Prenda::precioVenta).sum();
        //return listaDePrendas.stream().mapToDouble(prendas -> prendas.precioVenta()).sum();
    }

    double precioFinal(MedioDePago medioDePago){
       return medioDePago.precioConRecargo(importe());
    }

}
