import java.util.Scanner;

public class SiralamaProgrami {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan üç sayıyı al
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı girin: ");
        int sayi3 = scanner.nextInt();

        // Sıralama işlemi
        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            if (sayi2 <= sayi3) {
                // sayi1 <= sayi2 <= sayi3
                System.out.println("Sıralama: " + sayi1 + " <= " + sayi2 + " <= " + sayi3);
            } else {
                // sayi1 <= sayi3 < sayi2
                System.out.println("Sıralama: " + sayi1 + " <= " + sayi3 + " < " + sayi2);
            }
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            if (sayi1 <= sayi3) {
                // sayi2 <= sayi1 <= sayi3
                System.out.println("Sıralama: " + sayi2 + " <= " + sayi1 + " <= " + sayi3);
            } else {
                // sayi2 <= sayi3 < sayi1
                System.out.println("Sıralama: " + sayi2 + " <= " + sayi3 + " < " + sayi1);
            }
        } else {
            if (sayi1 <= sayi2) {
                // sayi3 <= sayi1 <= sayi2
                System.out.println("Sıralama: " + sayi3 + " <= " + sayi1 + " <= " + sayi2);
            } else {
                // sayi3 <= sayi2 < sayi1
                System.out.println("Sıralama: " + sayi3 + " <= " + sayi2 + " < " + sayi1);
            }
        }


    }
}