import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class sltn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double payment=sc.nextDouble();



        Locale localeIndian = new Locale("en", "in");

        Locale Locales[]={Locale.US,localeIndian,Locale.CHINA,Locale.FRANCE};
        String[] country = {"US: ", "India: ", "China: ", "France: "};


        for(int i=0;i<Locales.length;i++){
            NumberFormat nf=NumberFormat.getCurrencyInstance(Locales[i]);
            String format= nf.format(payment);
            System.out.println(country[i]+payment);

        }



    }

}
