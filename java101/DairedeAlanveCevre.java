import java.util.Scanner;

public class DairedeAlanveCevre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int r;
        double pi=3.14,alan,cevre;
        r=input.nextInt();
        alan=pi*r*r;
        cevre=2*pi*r;
        System.out.println("alan:"+alan);
        System.out.println("cevre"+cevre);

        System.out.println("merkez açısının öçlüsünü giriniz:");
        int m=input.nextInt();
        System.out.println("Merkez açısının ölçüsü"+m+"olan dairenin alanı"+(pi * (r*r) * m) / 360);





    }
}