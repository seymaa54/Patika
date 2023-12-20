import java.util.Scanner;

public class NumberofDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi=input.nextInt();
        int basValue=0;
        int tempN=sayi;

        int result=0;

        while (tempN!=0){
            basValue=tempN%10;
            System.out.println(basValue);
            tempN/=10;
           result+=basValue;
        }
        System.out.println("toplam:"+result);

    }
}