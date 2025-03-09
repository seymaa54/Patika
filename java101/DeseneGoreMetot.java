import java.util.Scanner;
public class DeseneGoreMetot {

    /*
     * N Sayısı : 16
     * Çıktısı : 16 11 6 1 -4 1 6 11 16
     * 
     * 
     * N Sayısı : 10
     * Çıktısı : 10 5 0 5 10
     */

    static void desen(int num, int temp, boolean azaliyor) {
        System.out.print(num + " ");

        if (num > 0 && azaliyor) {
            desen(num - 5, temp, true);
        }

        else if(num<=0){
            desen(num+5, temp, false);
        }
        else if (!azaliyor && num < temp) {
            desen(num + 5, temp, false);
        }  

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz:  ");
        int num = input.nextInt();
        desen(num, num, true);

    }
}
