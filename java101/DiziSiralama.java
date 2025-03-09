import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dizinin Boyutu n: ");
        int[] arr = new int[scan.nextInt()];
        System.out.println(arr.length);
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". Elemanı:");
            arr[i] = scan.nextInt();
        }
        scan.close();
        // Selection Sort algoritması
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            // Ara adımları görmek için
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Sıralama: " + Arrays.toString(arr));
    }

}
