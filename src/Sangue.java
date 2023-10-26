import java.util.Scanner;

public class Sangue {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        int idade = keyboardScanner.nextInt();
        if (idade >= 16 || idade <= 69)  {
            System.out.println("Você pode doar sangue!");
        } else {
            System.out.println("Você não pode doar sangue!");
        }
    }
}
