import java.util.Scanner;

public class TekSayilar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //Ödev
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoru

        int a=0,sum=0;
        do{
            System.out.print("sayi giriniz:");
            a= input.nextInt();
            if(a%2==0&&a%4==0){
               sum+=a;}
        }while (a%2==0);
        System.out.println("toplam:"+sum);



    }
}