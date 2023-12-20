import java.util.Scanner;

public class CiftSayilar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
     //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
        // tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        System.out.println("sayi giriniz:");
       int t= sc.nextInt();
       double average;
       int count=0,sum=0;

        for(int i=0;i<t;i++){
            if(i%3==0 && i%4==0){
                sum+=i;
                count++;
                System.out.println(i);
            }
        }
        System.out.println("ortalama:"+(sum/count));
    }
}