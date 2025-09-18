package actVehiculos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Turismo("1234ABC", "Toyota", "Corolla", "Rojo", 50.0, 4));
        vehiculos.add(new Deportivo("5678DEF", "Ford", "Mustang", "Azul", 80.0, 5.0));
        vehiculos.add(new Furgoneta("9101GHI", "Mercedes", "Sprinter", "Blanco", 70.0, 1000.0));

        for(Vehiculo v : vehiculos){
            System.out.println(v.toString());
        }


    }
}
