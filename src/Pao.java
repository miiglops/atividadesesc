import java.util.Scanner;

public class Pao {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Você tem quanto de dinheiro?");
        double dinheiro = keyboardScanner.nextFloat();
        double pao = 0.50;
        if (dinheiro>pao) {
            System.out.println("Você pode comprar pão");
        } else {
            System.out.println("Você não pode comprar pão");
        }
    }
}
