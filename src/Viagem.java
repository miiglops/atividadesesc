import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Qual é a distância da viagem?");
        double d = keyboardScanner.nextDouble();
        System.out.println("Qual a velocidade do carro?");
        double v = keyboardScanner.nextDouble();

        double t = d/v;
        System.out.println("O tempo de viagem é aproximadamente: "+t+"H");
        if (t>3) {
            System.out.println("Você deve fazer uma parada para descanso!");
        }
    }
}
