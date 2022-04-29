package queMePongo.uniforme;

import queMePongo.prenda.Prenda;

public class Uniforme {
  Prenda prendaSuperior;
  Prenda prendaInferior;
  Prenda prendaCalzado;

  public Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda prendaCalzado){
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.prendaCalzado = prendaCalzado;
  }

  public void fabricar(UniformeInstitucion uniformeInstitucion){
    Uniforme uniforme = new Uniforme(
        UniformeInstitucion.fabricarParteSuperior(),
        UniformeInstitucion.fabricarParteInferior(),
        UniformeInstitucion.fabricarParteCalzado()
    );
  }
}
