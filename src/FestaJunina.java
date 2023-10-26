import java.util.Scanner;

public class FestaJunina {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        int idade = keyboardScanner.nextInt();
        if (idade>=16) {
            System.out.println("Você pode participar da Festa Junina!");
        } else {
            System.out.println("Você não pode participar da Festa Junina!");
        }
    }
}
