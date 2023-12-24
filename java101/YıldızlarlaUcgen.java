import java.util.Scanner;

public class YıldızlarlaUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int n= input.nextInt();;
        int bosluk=n-1;
       //satır bosluk yıldız
        int yildiz=1;


       /* for(int i=1;i<=n;i++){

            for(int k=0;k<bosluk;k++){
                System.out.print(" .");
            }
            bosluk--;


            for(int j=0;j<yildiz;j++){
                System.out.print("*");}
            System.out.println("");
            yildiz++;

        }*/


    /*    for(int i=0;i<n;i++){
            for(int j=0;j<yildiz;j++){
                System.out.print("*");
            }
            yildiz++;
            for(int k=0;k<bosluk;k++){
                System.out.print(".");
            }
            bosluk--;
            System.out.println(" ");

        }*/

   /*     for(int i=0;i<n;i++){
            for(int j=0;j<bosluk;j++){
                System.out.print(".");
            }
            bosluk--;
            for(int k=0;k<yildiz;k++){
                System.out.print("*");
            }
            yildiz+=2;
            System.out.println("");

        }

*/
   /*     for(int i=0;i<n-1;i++){
            for(int j=0;j<bosluk;j++){
                System.out.print(" ");
            }
            bosluk--;
            for(int k=0;k<yildiz;k++){
                System.out.print("*");
            }
            yildiz+=2;
            System.out.println("");
        }


        yildiz=n*2-1;
        bosluk=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<bosluk;j++){
                System.out.print(" ");

            }
            bosluk++;
            for(int j=0;j<yildiz;j++){
                System.out.print("*");
            }

            yildiz-=2;
            System.out.println(" ");

        }
*/

        yildiz=0;
        for(int i=0;i<n;i++){

            for (int j=0;j<bosluk;j++){
                System.out.print(" ");
            }
            bosluk--;
            for(int k=0;k<yildiz;k++){
                if(k==0){
                    System.out.print("/");
                } if (k==yildiz-1) {
                    System.out.print("\\");

                } else {
                    System.out.print("*");
                }



            }
            yildiz+=2;
            System.out.println("");

        }



         bosluk=0;
        yildiz=n*2;
        for(int i=0;i<n;i++){

            for(int j=0;j<bosluk;j++){
                System.out.print(" ");}
            bosluk++;

            for(int k=0;k<yildiz;k++){
                if(k==0){
                    System.out.print("\\");

                }
                if(k==yildiz-1){
                    System.out.print("/");

                }
                else{System.out.print("*");}

            }
            yildiz-=1;
            System.out.println(" ");

        }







    }
}