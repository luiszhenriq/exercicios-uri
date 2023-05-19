import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double raio, total;
        double pi = 3.14159;

        raio = sc.nextDouble();
        

        total = (4.0 / 3.0) * pi * raio * raio * raio;

        System.out.printf("VOLUME = %.3f%n", total);
        sc.close();
    }
}