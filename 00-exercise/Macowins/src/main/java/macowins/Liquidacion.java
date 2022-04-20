package macowins;

class Liquidacion implements EstadoPrenda {

    double descuento = 0.5;

    @Override
    public double precioFinal(double precioOriginal) {
        return precioOriginal * descuento;
    }
}
