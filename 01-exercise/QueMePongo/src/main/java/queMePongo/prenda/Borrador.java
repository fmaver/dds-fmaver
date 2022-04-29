package queMePongo.prenda;

import queMePongo.material.Material;
import queMePongo.material.Trama;
import queMePongo.prenda.*;

import java.awt.*;

import static java.util.Objects.requireNonNull;

public class Borrador {

  TipoPrenda tipoPrenda;
  Categoria categoria;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;

  public Borrador(TipoPrenda tipoPrenda){
    this.tipoPrenda = requireNonNull(tipoPrenda, "Type is mandatory");
  }

  public void especificarCategoria(Categoria categoria){
    this.categoria = requireNonNull(categoria, "categoria is mandatory");
  }

  public void especificarMaterial(Material material){
    if(material.tipoDeMaterial==null) {
      throw new Prenda.PrendaInvalidaException("Material type is missing");
    }
    else if(material.trama==null){
      this.material.tipoDeMaterial = material.tipoDeMaterial;
      this.material.trama = Trama.LISA;
    }
    else{
      this.material = material; //aca quedan iniciadas ambos argumentos de la clase Material
    }
  }
  public void especificarColorPrincipal(Color colorPrincipal){
    this.colorPrincipal = requireNonNull(colorPrincipal, "Color is mandatory");
  }

  public Prenda crearPrenda(){
    return new Prenda(tipoPrenda, categoria, material, colorPrincipal, colorSecundario);
  }

}
