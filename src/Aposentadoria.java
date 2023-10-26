import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        int idade = keyboardScanner.nextInt();
        System.out.println("Quantos anos de contribuição você tem?");
        int contribuicao = keyboardScanner.nextInt();

        if (idade >= 70 || contribuicao >= 50) {
            System.out.println("Você já pode se aposentar");
        } else {
            System.out.println("Você ainda não pode se aposentar!");
        }
    }
}
