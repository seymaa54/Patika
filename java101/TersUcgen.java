import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayisini giriniz:  ");
        int n=input.nextInt();
        int bosluk=0;
        int yildiz=2*n-1;

        for(int i=0;i<n;i++){
            for(int j=0;j<bosluk;j++){
                System.out.print(" ");
            }
            bosluk++;
            for(int k=0;k<yildiz;k++){
                System.out.print("*");
            }
            yildiz-=2;
            System.out.println("");
        }

}}
