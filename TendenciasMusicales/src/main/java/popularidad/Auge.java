package popularidad;

import formatoCancion.Icono;
import tendenciasMusicales.Cancion;

public class Auge extends Popularidad{
    private static int cantReproduccionMax = 50000; //atributo static (no cambia)
    private static int cantLikeMax = 20000;
    private static int cantDislikeMax = 5000;
    private int cantDislike;
    private int cantReproducciones;

    public Auge() {
        this.cantReproducciones = 0;
        this.cantDislike = 0;
    }

    public void reproducir(Cancion cancion) {
        this.cantReproducciones++;
        if(this.cantReproducciones > cantReproduccionMax && cancion.getCantLikes() > cantLikeMax) {
            cancion.setPopularidad(new Tendencia());
        }else {
            if(this.cantDislike > cantDislikeMax) {
                cancion.setPopularidad(new Normal());
            }
        }
    }

    //detalleCompletoPara(cancion) --> esta en la clase padre

    @Override
    protected String icono() {
        return Icono.ROCKET.texto();
    }

    @Override
    protected String leyenda(Cancion cancion) {
        return cancion.getAlbum().getArtista().getNombre();
    }
}
