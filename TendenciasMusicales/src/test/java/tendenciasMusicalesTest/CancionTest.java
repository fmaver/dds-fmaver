package tendenciasMusicalesTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import popularidad.Auge;
import popularidad.Normal;
import tendenciasMusicales.Album;
import tendenciasMusicales.Artista;
import tendenciasMusicales.Cancion;

public class CancionTest {

    private Cancion cancion;
    private Artista artista;
    private Album album;

    //@BeforeEach se ejecuta esto antes de cada metodo normal
    //@BeforeAll se ejecuta una vez al principio

    @BeforeEach
    public void init() {
        this.artista = new Artista();
        this.artista.setNombre("Coldplay");

        this.album = new Album();
        this.album.setArtista(this.artista);
        this.album.setAnio(2002);
        this.album.setNombre("A Rush of Blood to the head");

        this.cancion = new Cancion("The Scientist");


    }

    @Test
    @DisplayName("The Scientist recién se lanza (tiene popularidad normal)")
    public void cancionTienePopularidadNormal() {
        this.cancion.reproducir();

        Assertions.assertEquals(Normal.class.getName(), this.cancion.getPopularidad().getClass().getName());
    }

    @Test
    @DisplayName("The Scientist está en auge por superar el mínimo de reproducciones esperadas.")
    public void cancionPasaDeNormalAAuge() {
        Normal.setCantReproduccionMax(3);
        this.cancion.reproducir();
        this.cancion.reproducir();
        this.cancion.reproducir();
        this.cancion.reproducir();

        Assertions.assertEquals(Auge.class.getName(), this.cancion.getPopularidad().getClass().getName());
    }


}
