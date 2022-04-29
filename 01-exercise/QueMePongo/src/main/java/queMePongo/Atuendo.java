package queMePongo;
import queMePongo.prenda.Categoria;
import queMePongo.prenda.Prenda;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Atuendo {
    List<Prenda> listaDePrendas;// = new ArrayList<>(4);
    LinkedHashMap<Categoria, Prenda> atuendoDict= new LinkedHashMap<>();

    Atuendo(Prenda prenda1, Prenda prenda2, Prenda prenda3, Prenda prenda4){
        listaDePrendas = Arrays.asList(prenda1,prenda2,prenda3,prenda4);
    }

    public LinkedHashMap<Categoria, Prenda> llenarDict(List<Prenda> listaDePrendas){
        for (Prenda p: this.listaDePrendas) {
            //if(!atuendoDict.keySet().contains(p.categoria)) {
            if(!atuendoDict.containsKey(p.categoria)) {
                atuendoDict.put(p.categoria, p);
            }
        }
        return atuendoDict;
    }
    public boolean validarPrendas(List<Prenda> listaDePrendas){
        return llenarDict(listaDePrendas).keySet().size()==4;
    }
}
