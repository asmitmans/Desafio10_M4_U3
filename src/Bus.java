public class Bus extends Vehiculo{
    private int cantidadDeAsientos;
    private int asientosOcupados;

    public Bus() {
    }

    public Bus(String color, String patente, int cantidadDeAsientos) {
        super(color, patente);
        this.cantidadDeAsientos = cantidadDeAsientos;
        this.asientosOcupados = 0;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(int asientosOcupados) {
        if (asientosOcupados <= cantidadDeAsientos) {
            this.asientosOcupados = asientosOcupados;
        } else {
            System.out.println("El número de asientos ocupados no puede exceder la cantidad de asientos.");
        }
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public int asientosDisponibles() {
        return (getCantidadDeAsientos()-getAsientosOcupados());
    }
}
