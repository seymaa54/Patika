import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n=input.nextInt();
        int sum=0;

        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.print(n+" sayısı bir mükemmel sayidir");}
        else{
            System.out.print(n+" sayısı bir mükemmel sayi değildir");}
        }
}