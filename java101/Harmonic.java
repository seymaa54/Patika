import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sayi giriniz: ");
        int a=sc.nextInt();
        double sum=0;


        for(int i=1;i<=a;i++){
            sum=sum+(1/i);

        }
        System.out.println(sum);


    }}

