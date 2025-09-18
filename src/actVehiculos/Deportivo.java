package actVehiculos;

public class Deportivo extends Vehiculo{
    private double cilindrada;

    public Deportivo(String matricula, String marca, String modelo, String color, double tarifa, double cilindrada) {
        super(matricula, marca, modelo, color, tarifa);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(double cilindrada){
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Deportivo--> "+super.toString() + ", cilindrada=" + cilindrada;
    }
}
