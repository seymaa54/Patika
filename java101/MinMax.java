import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Sayi gireceksiniz? ");
        int n1=input.nextInt();

        System.out.println("1.sayiyi giriniz: ");
        int sayi=input.nextInt();
        int enK=sayi,enB=sayi;


        for(int i=2;i<=n1;i++){
            System.out.println(i+".sayiyi giriniz: ");
             sayi=input.nextInt();

            if(sayi<=enK){
                enK=sayi;

            }
            if(sayi>=enB){
                enB=sayi;
            }
        }
        System.out.println("Max:"+enB);
        System.out.println("Min:"+enK);

}}
