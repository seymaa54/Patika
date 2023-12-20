import java.util.Scanner;

public class UcakBileti {


    /*
    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
    Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
 yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double distance;
        int age;
        int type;

       System.out.println("Mesafeyi km türünden giriniz :");
        distance = sc.nextDouble();
        if(distance<0){
            while(distance<0){
                System.out.print("Hatalı veri girdiniz! "+
                        "Mesafeyi km türünden giriniz :");
                distance = sc.nextDouble();}
            }

        System.out.println("Yaşınızı giriniz :");
        age = sc.nextInt();
        if(age<0){
           while(age<0){
            System.out.println("Hatalı veri girdiniz! Yaşınızı giriniz :");
            age = sc.nextInt();}
            }

        System.out.println(" Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        type = sc.nextInt();
        if(type != 1 || type != 2){
            while (type!=1 && type!=2){
                System.out.println(" Hatalı Veri Girdiniz! Seçimler 1 veya 2");
                type = sc.nextInt();
            }


    }

        double ucret=distance*0.10;
        System.out.println("Bilet ücretiniz:"+ucret);
        if(age<=12){
            ucret=ucret-ucret*0.5;


        } else if (age>12 && age<24) {
            ucret=ucret-ucret*0.10;


        } else if (age>65) {
            ucret=ucret-ucret*0.30;
        }
        System.out.println("Yaş indirimi sonrası fiyat:"+ucret);


        if(type==2){
            ucret=ucret-ucret*0.20;
        }
        System.out.println("Toplam tutar:"+ucret);
    }}