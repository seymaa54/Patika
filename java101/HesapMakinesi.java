import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz: ");
        double a=input.nextDouble();
        System.out.println("birinci sayıyı giriniz: ");
        double b=input.nextDouble();
        int c=1;
        while (c==1) {

            System.out.println("yapmak istediğiniz işlemi seçiniz:");
            System.out.println("1-topla \n2-çıkar\n3-çarp \n4-böl \n5-çıkış");
            int operation = input.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Girmiş olduğunuz sayıların toplamı: " + (a + b));
                    break;
                case 2:
                    System.out.println("Girmiş olduğunuz sayıların farkı: " + (a - b));
                    break;
                case 3:
                    System.out.println("Girmiş olduğunuz sayıların çarpımı: " + (a * b));
                    break;
                case 4:
                    System.out.println("Girmiş olduğunuz sayıların bölümü: " + (a / b));
                    break;
                case 5:
                   c=0;
                    break;

                default:
                    System.out.println("Lütfen geçerli bir işlem giriniz: ");

            }


        }



    }
}