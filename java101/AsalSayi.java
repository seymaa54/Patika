import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2 3 5 7 9
        int count=0;

        for(int i=2;i<100;i++){
            //alınan her sayı başlangıçta asal kabul edilir
            // eğer asal değilse isprime false a çekilir
            boolean isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                   isPrime=false;
                   break;
                }
            }
            if(isPrime){
                count++;
                System.out.print(i+",");
            }

        }




    }}