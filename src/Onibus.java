import java.util.Scanner;

public class Onibus {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        int idade = keyboardScanner.nextInt();
        if (idade<3) {
            System.out.println("O seu ingresso é de graça!");
        } else if (idade<=18) {
            System.out.println("O valor do seu ingresso é de R$25,00");
        } else {
            System.out.println("O valor do seu ingresso é de R$50,00");
        }
    }
}
