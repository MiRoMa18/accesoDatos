import java.util.Locale;
import java.util.Scanner;

public class EncontrarVocales {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una frase y sacaré la cantidad de vocales que tiene");
        String frase = scanner.nextLine();
        int contadorAs=0;
        int contadorEs=0;
        int contadorIs=0;
        int contadorOs=0;
        int contadorUs=0;
        frase = frase.toLowerCase();

        for(int i = 0; i < frase.length(); i++){
            switch(frase.charAt(i)){
                case 'a' -> contadorAs++;
                case 'e' -> contadorEs++;
                case 'i' -> contadorIs++;
                case 'o' -> contadorOs++;
                case 'u' -> contadorUs++;
            }
        }

        System.out.printf("Tu frase contiene estas vocales:\n " +
                "a: %d\n " +
                "e: %d\n " +
                "i: %d\n " +
                "o: %d\n " +
                "u: %d\n ",
                contadorAs, contadorEs, contadorIs, contadorOs, contadorUs);
    }
}
