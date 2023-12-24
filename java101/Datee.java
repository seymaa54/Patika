import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Datee {
    public static void main(String[] args) {

        Calendar c=new GregorianCalendar();
        int d,m,y;
        Scanner input=new Scanner(System.in);
        d=input.nextInt();
        m=input.nextInt();
        y=input.nextInt();

        try{
            if(2000<=y && y<=3000){
                c.set(y,m-1,d);
                String gunAdi = c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, java.util.Locale.getDefault());

                System.out.println("Bu gun :"+gunAdi);
            }
            else{
                System.out.println("gecerli bir tarih giriniz");
            }
        }catch (Exception e){
            System.out.println("Bir hata olustu.");
        }






      /*  Scanner sc=new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String date =sc.nextLine();
        Date tarih = formatter.parse(date);
        String strDate = formatter.format(tarih);
        System.out.println(strDate);

        Date takvim=c.getTime();
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");


        */
    }
}

