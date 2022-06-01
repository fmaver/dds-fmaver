package queMePongo.uniforme;

import queMePongo.material.Material;
import queMePongo.material.TipoDeMaterial;
import queMePongo.prenda.Borrador;
import queMePongo.prenda.Categoria;
import queMePongo.prenda.Prenda;
import queMePongo.prenda.TipoPrenda;

import java.awt.*;

public class UniformeSanJuan implements UniformeInstitucion {

  public Prenda fabricarParteSuperior() {
    Borrador borrador = new Borrador(TipoPrenda.CAMISA);
    borrador.especificarCategoria(Categoria.SUPERIOR);
    borrador.especificarMaterial(new Material(TipoDeMaterial.TELA,null));
    borrador.especificarColorPrincipal(Color.GREEN);
    return borrador.crearPrenda();
  }

  public Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador(TipoPrenda.PANTALON);
    borrador.especificarCategoria(Categoria.INFERIOR);
    borrador.especificarMaterial(new Material(TipoDeMaterial.ACETATO,null));
    borrador.especificarColorPrincipal(Color.GRAY);
    return borrador.crearPrenda();
  }

  public Prenda fabricarParteCalzado() {
    Borrador borrador = new Borrador(TipoPrenda.ZAPATILLAS);
    borrador.especificarCategoria(Categoria.CALZADO);
    borrador.especificarMaterial(new Material(TipoDeMaterial.GOMA,null));
    borrador.especificarColorPrincipal(Color.WHITE);
    return borrador.crearPrenda();
  }
}
