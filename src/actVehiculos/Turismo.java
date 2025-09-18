package actVehiculos;

public class Turismo extends Vehiculo{
    private int puertas;

    public Turismo(String matricula, String marca, String modelo, String color, double tarifa, int puertas) {
        super(matricula, marca, modelo, color, tarifa);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Turismo--> "+super.toString() + ", puertas=" + puertas;
    }


}
