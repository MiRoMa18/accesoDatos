import java.util.Scanner;

public class Calculadora {

    public Calculadora() {
    }

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }

    public void todo(int a, int b) {
        System.out.print("Suma: " + sumar(a, b) + "\nResta: " + restar(a, b) + "\nMultiplicacion: " + multiplicar(a, b) + "\nDivision: " + dividir(a, b) + "\n");
    }
}
