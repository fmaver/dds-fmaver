package tendenciasMusicales;

import lombok.Getter;
import lombok.Setter;
import popularidad.Normal;
import popularidad.Popularidad;

import java.time.LocalDateTime;

@Setter @Getter //  arriba de la clase se generan todos los getter y setter
public class Cancion {

    private Album album;
    private String nombre;
    private int cantLikes;
    private int cantDislikes;
    private int cantReproducciones;
    private Popularidad popularidad = new Normal();

    private LocalDateTime fechaHoraUltimaVez;

    public Cancion(String nombre) {
        this.nombre = nombre;
        this.cantLikes = 0;
        this.cantDislikes = 0;
        this.cantReproducciones = 0;
    }

    public void reproducir() {
        this.cantReproducciones++;
        this.popularidad.reproducir(this); //chequeo si se puede cambiar la popularidad
        this.fechaHoraUltimaVez = LocalDateTime.now();
    }

    public String detalleCompleto() {
        return this.popularidad.detalleCompletoPara(this);
    }

}
