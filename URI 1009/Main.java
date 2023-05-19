import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salario, venda, total;
        
        salario = sc.nextDouble();
        venda = sc.nextDouble();
         
        total = salario + venda * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n", total);


        sc.close();
    }
}
