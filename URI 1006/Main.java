import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;
        double media;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

        System.out.printf("MEDIA = %.1f%n", media);



        sc.close();

    }
}
