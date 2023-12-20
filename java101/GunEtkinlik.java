import java.util.Scanner;

public class GunEtkinlik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.


         */
        while (true){
            Double heat=input.nextDouble();

            if(heat>=5 && heat<=15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if(heat<5){
            System.out.println("Kayağa gidebilirsiniz.");
        }
        else if(heat>15){
            if(heat<=25){
                System.out.println("pikniğe gidebilirsiniz.");
            }
            else System.out.println("yüzmeye gidebilirsiniz");

        }}}}