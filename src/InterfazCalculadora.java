import java.util.Scanner;

public class InterfazCalculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0,b=0;
        String option="";
        Calculadora calc = new Calculadora();
        do{
            System.out.println("-----------CALCULADORA------------");
            System.out.print("Que quieres hacer:\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Todos\n6.Ingresar nº1\n7.Ingresar nº2\n8.Salir\n");
            option = scanner.nextLine();
            switch(option){
                case "1" -> System.out.println("El resultado de la suma del num1:"+ a +" y num2:" + b + " es: "+calc.sumar(a,b));
                case "2" -> System.out.println("El resultado de la resta de "+ a +" y " + b + " es: "+calc.restar(a,b));
                case "3" -> System.out.println("El resultado de la multiplicacion de "+ a +" y " + b + " es: "+calc.multiplicar(a,b));
                case "4" -> System.out.println("El resultado de la division de "+ a +" y " + b + " es: "+calc.dividir(a,b));
                case "5" -> calc.todo(a,b);
                case "6" -> {
                    System.out.println("Numero 1");
                    a = scanner.nextInt();
                }
                case "7" -> {
                    System.out.println("Numero 2");
                    b = scanner.nextInt();
                }
                case "8" -> System.out.println("Calculadora finalizada");
                default -> System.out.println("Opcion no valida");
            }
        }while(!option.equals("8"));
        scanner.close();

    }
}
