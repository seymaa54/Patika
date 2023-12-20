import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name,password;
        int right=2;
        int bakiye=1500;
        int select=0;
        while (right>=0){
            System.out.print("kullanıcı adinizi girin:");
            name=input.nextLine();
            System.out.print("şifrenizi girin:");
            password=input.nextLine();

            if(name.equals("patika")&&password.equals("dev123")){
                while (select!=4){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                 select = input.nextInt();
                if(select==1){
                    System.out.println("yatırmak istenilen tutarı giriniz:");
                    int tutar=input.nextInt();
                    bakiye+=tutar;
                    System.out.println("Yeni bakiyeniz: "+bakiye);
                }
                else if(select==2){
                    System.out.println("çekmek istenilen tutarı giriniz: ");
                    int tutar=input.nextInt();
                    if(bakiye>tutar){
                        bakiye-=tutar;
                        System.out.println("yeni bakiyeniz: "+bakiye);}
                    else{
                        System.out.println("Yetersiz bakiye");
                    }

                }
                else if(select==3){
                    System.out.println("Mevcut Bakiyeniz:"+bakiye);

                }
                else if(select==4){
                    System.out.println("Çıkış yapılıyor..");
                    break;

                }
            }
            break;}
            else if(right==0) {
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");break;}
            else{
                    System.out.println("Kalan Hakkınız : " + (right));
                    right--;
            }

            }


        }


}
