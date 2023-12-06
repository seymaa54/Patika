import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double tutar,kdv,kdvOrani,kdvliTutar;
        System.out.println("tutarı gir:");
        tutar=input.nextDouble();
        if(tutar>=0 &&tutar<=1000 ){
            kdvOrani=0.18;
        }
        else{kdvOrani=0.08;}
        kdv=tutar*kdvOrani;
        kdvliTutar=tutar+kdv;

        System.out.println("tutar:"+tutar);
        System.out.println("kdv oranı:"+kdvOrani);
        System.out.println("kdv tutarı:"+kdv);
        System.out.println("toplam tutar:"+kdvliTutar);


    }
}
