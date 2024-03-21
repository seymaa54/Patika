import java.util.Scanner;

public class UsluRecursive {
   static int carpim=1;

    static int power(int b,int e){
        if(e>=1){
            carpim=carpim*b;
            e--;
            power(b,e);
        }

       return carpim;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Taban değerini giriniz: ");
        int b=input.nextInt();
        System.out.println("üs değerini giriniz: ");
        int e=input.nextInt();

        System.out.println(power(b,e));

    }
}