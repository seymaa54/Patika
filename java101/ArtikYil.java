import java.util.Scanner;
public class ArtikYil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
        System.out.println(" Yıl Giriniz :");
        int yil=input.nextInt();
        if(yil%4==0 || (yil%100==0 && yil%400==0)){
            System.out.println(yil+"bir artık yıldır !");

        }
        else{
            System.out.println(yil+"bir artık yıldır değildir !");
        }
}}}
