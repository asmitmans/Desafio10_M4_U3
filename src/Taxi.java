public class Taxi extends Vehiculo{
    private int valorPasaje;

    public Taxi() {
    }

    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int pagarPasaje(int valorPagado) {
        if(valorPagado>=valorPasaje) {
            return (valorPagado-valorPasaje);
        }
        return valorPagado;
    }
}
