package queMePongo.uniforme;

import queMePongo.material.Material;
import queMePongo.material.TipoDeMaterial;
import queMePongo.prenda.Borrador;
import queMePongo.prenda.Categoria;
import queMePongo.prenda.Prenda;
import queMePongo.prenda.TipoPrenda;

import java.awt.*;

public class UniformeJohnson implements UniformeInstitucion {

  public Prenda fabricarParteSuperior() {
    Borrador borrador = new Borrador(TipoPrenda.CAMISA);
    borrador.especificarCategoria(Categoria.SUPERIOR);
    borrador.especificarMaterial(new Material(TipoDeMaterial.TELA,null));
    borrador.especificarColorPrincipal(Color.WHITE);
    return borrador.crearPrenda();
  }

  public Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador(TipoPrenda.PANTALON);
    borrador.especificarCategoria(Categoria.INFERIOR);
    borrador.especificarColorPrincipal(Color.WHITE);
    borrador.especificarMaterial(new Material(TipoDeMaterial.VESTIR,null));
    return borrador.crearPrenda();
  }

  public Prenda fabricarParteCalzado() {
    Borrador borrador = new Borrador(TipoPrenda.ZAPATILLAS);
    borrador.especificarCategoria(Categoria.CALZADO);
    borrador.especificarColorPrincipal(Color.BLACK);
    borrador.especificarMaterial(new Material(TipoDeMaterial.GOMA,null));
    return borrador.crearPrenda();
  }
}
