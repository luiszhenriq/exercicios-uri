import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        int km;
	    double x, y;

	    km = sc.nextInt();
	    x = sc.nextDouble();

	    y = km / x;

	    System.out.printf("%.3f km/l%n", y);
		
		sc.close();

    }
}
