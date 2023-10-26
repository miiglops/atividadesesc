import java.util.Scanner;

public class Bicicleta {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Qual distancia diária percorrida?");
        double diaria = keyboardScanner.nextDouble();
        double total = diaria*7;
        System.out.println("Você percorreu um total de "+total+"Km em uma semana");
    }
}
