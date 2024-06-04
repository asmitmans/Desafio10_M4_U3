public class MiniBus extends Bus{
    private String tipoViaje;

    public MiniBus() {
    }

    public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
        super(color, patente, cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public void imprimeBus() {
        String atributos = "MiniBus{" +
                "color='" + getColor() + '\'' +
                ", patente='" + getPatente() + '\'' +
                ", cantidad de asientos='" + getCantidadDeAsientos() + '\'' +
                ", asientos ocupados='" + getAsientosOcupados() + '\'' +
                ", tipo de viaje='" + getTipoViaje() + '\'' +
                '}';
        System.out.println(atributos);
    }
}
