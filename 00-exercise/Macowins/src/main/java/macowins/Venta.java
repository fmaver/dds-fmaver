package macowins;

import java.sql.Date;
import java.util.*;

abstract class Venta {
   List<Prenda> listaDePrendas;
   Date fecha;

   Venta(List<Prenda> listaDePrendas, Date fecha){
       this.fecha = fecha;
       this.listaDePrendas = listaDePrendas;
   }
    double importe() {
        return listaDePrendas.stream().mapToDouble(prendas -> prendas.precioVenta()).sum();
    }
}
