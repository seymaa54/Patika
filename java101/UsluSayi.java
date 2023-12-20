import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
      /*  System.out.println("üssü alinacak sayiyi giriniz:");
        int sayi=sc.nextInt();
        System.out.println("kuvvet giriniz:");
        int kuvvet=sc.nextInt();
        int i=1,carpım=1;
        while (i<=kuvvet){
            carpım*=sayi;
            i++;}
        System.out.println("sonuç:"+carpım);*/



        //Ödev
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
        System.out.println("üssü alinacak sayiyi giriniz:");
        int sayi=sc.nextInt();
        System.out.println("kuvvet giriniz:");
        int kuvvet=sc.nextInt();

        int carpim=1;
        for(int i=1;i<=kuvvet;i++){
          carpim*=sayi;
        }
        System.out.println(carpim);
    }
}