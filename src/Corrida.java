import java.util.Scanner;

public class Corrida {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Qual a distância diária percorrida?");
        int diaria = keyboardScanner.nextInt();
        System.out.println("Qual a distância total da corrida?");
        int total = keyboardScanner.nextInt();

        int dias = total/diaria;
        System.out.println("Os atletas completarão a corrida em "+dias+" dias");
    }
}
