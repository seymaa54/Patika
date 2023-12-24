
import java.util.Scanner;
import java.util.regex.*;

public class Solution2 {

    private static int B = 0;
    private static int H = 0;


    public static int getArea(int B, int H) {
        return B * H;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String[] patterns = new String[a];
        for (int i = 0; i < a; i++) {
            patterns[i] = sc.next();
        }
        for (String p : patterns) {
            try{
                Pattern.compile(p);
                System.out.println("Valid");
            }
            catch(Exception e){
                System.out.println("Invalid");
            }


        }








       /* Scanner sc = new Scanner(System.in);
        String string=sc.nextLine().trim();

        String[] tokens = string.trim().split("[^A-Za-z0-9]+");

        System.out.println(tokens.length);
        if(string.trim().length()==0){
            System.out.println(0);
        }
        else {
            System.out.println(tokens.length);

            for (String s:tokens) {
            System.out.println(s);

        }}*/







/*
*  Scanner sc = new Scanner(System.in);
        //     int q=sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        double c=0;
        c = a + Math.pow(2, 0) * b;
        double sumC=sum+c;
        System.out.println(c);

        for (double i = 0; i < n; i++) {

            sumC+=Math.pow(2, i + 1)*b;
            System.out.println(sumC);

            }*/











        /* Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String str=String.format("%-15s", s1);
                String digi=String.format( "%03d", x);
                System.out.println(str+digi);
            }
            System.out.println("================================");
            sc.close();

  /*      Scanner scan = new Scanner(System.in);

        String data1=scan.nextLine();
        String data2=scan.nextLine();
        String data3=scan.nextLine();

        data1.contains("s");

String datas[]={data1,data2,data3};
Double d=0.0;
String s = "";
int in=0;

for(int i=0;i< datas.length;i++){
    if(datas[i].chars().allMatch(Character::isDigit) || datas[i].contains(".")){
         d=Double.parseDouble(datas[i]);
    }
    if(datas[i].chars().allMatch(Character::isDigit)){
        in=Integer.parseInt(datas[i]);
    }
 else{
     s=datas[i];
    }


}

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + in);

*/




      /*  Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();


        try {
            if(B <=0 || H <=0) {
                throw new IllegalArgumentException("java.lang.Exception: Breadth and height must be positive");
            } else {
                int res = Solution2.getArea(B,H);
                System.out.println(res);
            }
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }*/

    }}
