import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.sou
      //  int a=input.nextInt();
      //  for(int i=1;i<=a;i*=2){
      //      if(i<a){
      //          System.out.println(i);
      //      }
      //  }
        //Ödev
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        System.out.println("sayi girininiz: ");
        int a=input.nextInt();
        for(int i=1;i<=a;i*=20){
            System.out.println(i);
        }



        int i=1;
        while(i<=a){
            System.out.println(i);
            i*=20;
        }




    }
}