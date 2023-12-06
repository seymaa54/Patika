import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double boy=input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz ");
        double kilo=input.nextDouble();
        System.out.println("vücut kitle indeksi:"+(kilo/(boy*boy)));


    }


}

