package queMePongo.excepciones;

public class PrendaInvalidaException extends RuntimeException {
  public PrendaInvalidaException(String causa) {
    super("La prenda es inválida porque " + causa);
  }
}