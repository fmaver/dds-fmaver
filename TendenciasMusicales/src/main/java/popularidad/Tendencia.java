package popularidad;

import formatoCancion.Icono;
import tendenciasMusicales.Cancion;

public class Tendencia extends Popularidad{

    public void moverANormalSiEsPosible(Cancion cancion) {
        //TODO
        // verificar si la utlima reproduccion es >24hs y pasar la cancion a normal
        // este metodos se va a llamar en el cron task
    }
    public void reproducir(Cancion cancion) {
        this.moverANormalSiEsPosible(cancion);
    }

    //detalleCompletoPara(cancion) --> esta en la clase padre

    @Override
    protected String icono() {
        return Icono.FIRE.texto();
    }

    @Override
    protected String leyenda(Cancion cancion) {
        return cancion.getNombre();
    }
}
