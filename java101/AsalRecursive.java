import java.util.Scanner;

public class AsalRecursive {

    static int asal(int s, int k) {
        //kendisinden kküçük sayılara bölünmemesi gerekiyor
        if (s == 2) {
            return 1;
        }
        if (s % k == 0) {
            return 0;
        } else {
            if (k > 2) {
                //k>2 olduğu sürece asal(s, k - 1) fonksiyonunun sonucu döndürülecek
                return asal(s, k - 1);
            }
            return 1;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Sayi Giriniz:  ");
            int s = input.nextInt();
            int sonuc = asal(s, s - 1);
            if (sonuc == 0) {
                System.out.println(s + " Sayisi Asal Sayi Değildir");
            } else {
                System.out.println(s + " Sayisi Asal Sayidir");
            }

        }

    }
}
