import java.util.Arrays;

public class HarmonikOrtalama {
  public static void main(String[] args) {

    int[] numbers = { 1, 2, 3, 4, 5};
    double average = 0;
    double sum = 0.0;

    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    average = sum / numbers.length;
    System.out.println("Average: " + average);

  }
}
