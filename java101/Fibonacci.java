import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci dizisi kaç eleman içermeli? ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci dizisi:");

        // İlk iki elemanı yazdır
        int a = 0, b = 1;
        System.out.print(a + ", " + b + ", ");

        // 0 1 1 2 3 5 8 13

        // Fibonacci dizisini hesapla ve yazdır
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }


}}
