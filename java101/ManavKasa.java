import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double PEAR_PRICE = 2.14;
        double APPLE_PRICE = 3.67;
        double TOMATOES_PRICE = 1.11;
        double BANANA_PRICE = 0.95;
        double EGGPLANT_PRICE = 5.0;
        double toplamTutar,armutKg , armutFiyat,elmaKg, elmaFiyat;
        double domatesKg , domatesFiyat , muzKg , muzFiyat;
        double patlicanKg , patlicanFiyat ;
        System.out.println("Armut Kilo ? :");
        armutKg = input.nextDouble();
        System.out.println("Elma  Kilo ? :");
        elmaKg = input.nextDouble();
        System.out.println("Domates  Kilo ? :");
        domatesKg = input.nextDouble();
        System.out.println("Muz Kilo ? :");
        muzKg = input.nextDouble();
        System.out.println("Patlıcan  Kilo ? :");
        patlicanKg = input.nextDouble();
        armutFiyat = armutKg * PEAR_PRICE;
        elmaFiyat = elmaKg * APPLE_PRICE;
        domatesFiyat = domatesKg * TOMATOES_PRICE;
        muzFiyat = muzKg * BANANA_PRICE;
        patlicanFiyat = patlicanKg * EGGPLANT_PRICE;
        toplamTutar = armutFiyat + elmaFiyat + domatesFiyat + muzFiyat + patlicanFiyat;
        System.out.format("Toplam Tutar: %.2f\n", toplamTutar);
    }
}