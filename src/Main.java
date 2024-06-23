import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int tempoGasto = input.nextInt();
        int velocidadeMedia = input.nextInt();

        double consumo = (tempoGasto * velocidadeMedia) / 12.0;

        System.out.printf("%.3f\n", consumo);

        input.close();

    }
}
