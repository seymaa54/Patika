import  java.util.Scanner;
public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        double mat,fizik,kimya,tarih,muzik;
        Scanner input=new Scanner(System.in);

        System.out.println("mat not:?");
        mat=input.nextInt();
        fizik=input.nextInt();
        kimya=input.nextInt();
        tarih=input.nextInt();
        muzik=input.nextInt();

        double toplam=mat+fizik+kimya+tarih+muzik;
        double sonuc=toplam/5;
        System.out.println("ortalamanız:"+sonuc);
        System.out.println(sonuc>50  ? "geçti":"kaldı");

    }
}