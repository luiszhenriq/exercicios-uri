import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);


       int number, hora;
       double salario;

       number = sc.nextInt();
       hora = sc.nextInt();
       salario = sc.nextDouble();

       salario = (salario * hora);

       System.out.println("NUMBER = " + number);
       System.out.printf("SALARY = U$ %.2f%n", salario);

       






      sc.close();  
    }
}
