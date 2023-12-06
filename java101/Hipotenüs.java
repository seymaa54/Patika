import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Hipotenüs {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("kenarları girin");

        int a,b,c,u,cevre;
        double alan;

        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();

        cevre=a+b+c;
        u=cevre/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("iki kenarını girmiş olduğunuz  üçgenin alanı:"+alan);
        System.out.println("iki kenarını girmiş olduğunuz  üçgenin çevresi:"+cevre);


    }
}
