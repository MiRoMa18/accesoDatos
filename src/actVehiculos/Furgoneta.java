package actVehiculos;

public class Furgoneta extends Vehiculo{
    private double carga;

    public Furgoneta(String matricula, String marca, String modelo, String color, double tarifa, double carga) {
        super(matricula, marca, modelo, color, tarifa);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }
    public void setCarga(double carga){
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Furgoneta--> " + super.toString() + ", carga=" + carga;
    }
}
