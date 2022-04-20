package macowins;
class Promocion implements EstadoPrenda {
    double descuento;
    public Promocion(double descuento) {
        this.descuento = descuento;
    }
    @Override
    public double precioFinal(double precioOriginal) {
        return precioOriginal - descuento;
    }
}
