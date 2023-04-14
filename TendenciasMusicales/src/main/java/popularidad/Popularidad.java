package popularidad;

import tendenciasMusicales.Cancion;

public abstract class Popularidad {

    public abstract void reproducir(Cancion cancion);
    //public abstract String detalleCompletoPara(Cancion cancion);

    // como siempre tengo que seguir el formato icono-leyenda, dejo que mi metodo sea abstracto y creo la siguiente logica:
    public String detalleCompletoPara(Cancion cancion) {
        String detalle = "";
        detalle += this.icono();
        detalle += " - ";
        detalle += this.leyenda(cancion);

        return detalle;
    }

    protected abstract String icono();
    protected abstract String leyenda(Cancion cancion);

}
