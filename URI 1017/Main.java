import java.util.Locale;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int tempo, velocidade;
    double result;

    tempo = sc.nextInt();
    velocidade = sc.nextInt();

    result = tempo / 12.0 * velocidade;

    System.out.printf("%.3f%n", result);



    sc.close();
   } 
}
