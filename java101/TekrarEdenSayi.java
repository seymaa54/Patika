public class TekrarEdenSayi {

    static boolean isFind(int[] arr, int val) {
        for (int i : arr) {
            if (i == val) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = { 3, 4, 3, 4, 2, 9, 10, 24, 1, 2, 9, 24 };
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j] && list[j] % 2 == 0)) {
                    if (!isFind(duplicate, list[j])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;

                }

            }
        }

        for (int i : duplicate) {
            if (i != 0) {
                System.out.println(i);

            }
        }
    }
}
