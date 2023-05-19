import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, maiorab;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        maiorab = (a + b + Math.abs(a - b)) / 2;
        maiorab = (maiorab + c + Math.abs(maiorab - c)) / 2;

        System.out.printf("%d eh o maior%n", maiorab);
        sc.close();

    }
}