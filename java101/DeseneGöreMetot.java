import java.util.Scanner;

public class DeseneGöreMetot {

    /*
    N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16


N Sayısı : 10
Çıktısı : 10 5 0 5 10
     */
    static void desen(int s) {
        if(s>0){
            s-=5;
            System.out.print(s+" ");
            desen(s);
        }
        if(s==0){
        }
        if(s<0){
            s+=5;
            System.out.println(s+" ");
            desen(s);
        }



    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz:  ");
        int s = input.nextInt();
        System.out.print(s+" ");
        desen(s);
    }
}
