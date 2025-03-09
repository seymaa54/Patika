public class Frekans {
    public static void main(String[] args) {
        int[] dizi = { 10, 20, 20, 10, 10, 20, 5, 20 };
        boolean[] isChecked = new boolean[dizi.length]; // Tüm değerler false başlar

        for (int i = 0; i < dizi.length; i++) {
            if (isChecked[i]) { 
                continue;
            }

            int f = 1; // Kendisi zaten en az 1 kere var
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    f++;
                    isChecked[j] = true; 
                }
            }

            System.out.println(dizi[i] + " sayısı " + f + " kere tekrar edildi.");
        }
    }
}
