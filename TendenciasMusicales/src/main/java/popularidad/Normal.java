package popularidad;

import formatoCancion.Icono;
import tendenciasMusicales.Cancion;

public class Normal extends Popularidad{
    private static int cantReproduccionMax = 1000; //atributo static (no cambia)
    private int cantReproducciones;

    // lo hago estatico y llamo a la clase Normal sin instanciar. Me sirve para hacerlo mas testeable
    public static void setCantReproduccionMax(int cantReproduccionMax) {
        Normal.cantReproduccionMax = cantReproduccionMax;
    }

    public Normal() {
        this.cantReproducciones = 0;
    }

    public void reproducir(Cancion cancion) {
        this.cantReproducciones++;
        if(this.cantReproducciones > cantReproduccionMax) {
            cancion.setPopularidad(new Auge()); //para el UML, vemos que Normal conoce a Auge (relacion de conocer)
        }
    }

    //detalleCompletoPara(cancion) --> esta en la clase padre

    @Override
    protected String icono() {
        return Icono.MUSICAL_NOTE.texto();
    }

    @Override
    protected String leyenda(Cancion cancion) {
        return cancion.getAlbum().getArtista().getNombre() + " - " + cancion.getAlbum().getNombre() + " - " + cancion.getNombre();
    }
}
