import java.util.Scanner;

public class Praia {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Como está o tempo hoje? 1 - Ensolarado | 2 - Nublado | 3 - Chuvoso");
        int clima = keyboardScanner.nextInt();
        if (clima == 1) {
            System.out.println("Você pode ir para a praia e leve guarda-sol");
        } else if (clima == 2) {
            System.out.println("Você pode ir para a praia mas cuidado com o tempo");
        } else if (clima == 3) {
            System.out.println("Não vá para a praia hoje!");
        }
    }
}
