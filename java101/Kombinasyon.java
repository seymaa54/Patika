import java.util.Scanner;

public class Kombinasyon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //C(n,r) = n! / (r! * (n-r)!)
        System.out.println("n değeri :");
        int n=input.nextInt();
        System.out.println("r değeri :");
        int r=input.nextInt();

        int carpim = 1;
        for (int i = 1; i <= n; i++) {
            carpim *= i;
        }

        int carpim2=1;
        for (int i = 1; i <= r; i++) {
            carpim2*= i;
        }

        int c3=1;
        for (int i = 1; i <= (n-r); i++) {
            c3*= i;
        }System.out.println("("+n+","+r+")"+":"+(carpim/(carpim2*c3)));

    }
}