package queMePongo.prenda;

import queMePongo.prenda.TipoPrenda;

import java.util.Arrays;

public enum Categoria {
    SUPERIOR{
        public boolean admiteTipo(TipoPrenda tipo){
            return Arrays.asList(TipoPrenda.MUSCULOSA, TipoPrenda.REMERA).contains(tipo);
        }
    },
    INFERIOR{
        public boolean admiteTipo(TipoPrenda tipo){
            return Arrays.asList(TipoPrenda.PANTALON, TipoPrenda.SHORT).contains(tipo);
        }
    },
    ACCESORIOS{
        public boolean admiteTipo(TipoPrenda tipo){
            return Arrays.asList(TipoPrenda.PULSERA, TipoPrenda.GORRA).contains(tipo);
        }
    },
    CALZADO{
        public boolean admiteTipo(TipoPrenda tipo){
            return Arrays.asList(TipoPrenda.ZAPATO, TipoPrenda.ZAPATILLAS).contains(tipo);
        }
    }
}
