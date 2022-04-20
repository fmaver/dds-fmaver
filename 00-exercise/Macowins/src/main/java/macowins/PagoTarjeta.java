package macowins;

public class PagoTarjeta extends MedioDePago{

    int cantidadCuotas;
    double coeficiente = 1;

    PagoTarjeta(int cantidadCuotas){
        this.cantidadCuotas = cantidadCuotas;
    }

    @Override
    public double recargo(double precio) {
        return (cantidadCuotas * coeficiente) + (0.01 * precio);
    }
}
