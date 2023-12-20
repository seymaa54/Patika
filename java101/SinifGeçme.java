import java.util.Scanner;

public class SinifGeçme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        int[] lessons = new int[5]; // 5 elemanlı boş bir dizi

        System.out.print("Math:");
        lessons[0]=input.nextInt();


        System.out.print("Physics");
        lessons[1]=input.nextInt();


        System.out.print("Turkish:");
        lessons[2]=input.nextInt();


        System.out.print("Chemistry:");
        lessons[3]=input.nextInt();


        System.out.print("Music:");
        lessons[4]=input.nextInt();

        double average = 0;

        for (int note:lessons) {
            if(note>0 && note<=100) average+=note;
            }
        double result=average/5;
        System.out.println("your average is:"+result);
        if(result>50) System.out.println("your passed");
        else System.out.println("unsuccessful");








    }
}