import java.util.Scanner;

public class GelismisHesapMakinesi {

  public static Scanner input = new Scanner(System.in);


    static void plus() {
        int toplam = 0;
        while (true) {
            System.out.print("Sayi giriniz:");
            int a = input.nextInt();
            toplam += a;
            if (a == 0) {
                break;
            }
        }
        System.out.println("Girdiğiniz sayilarin toplami:"+toplam);
    }

    static void minus() {
        int minus = 0;
        System.out.print("Kaç adet sayi gireceksiniz::");
            int a = input.nextInt();
            for(int i=1;i<=a;i++){
                System.out.print(i+".sayiyi giriniz:");
                int number=input.nextInt();
                if(number==1){
                    minus+=number;
                    continue;
                }
                minus-=number;

            }
        System.out.println("Girdiğiniz sayilarin farkı:"+minus);
        }

        static void times(){
            int i=1,result=1;
        while (true){
            System.out.print(i++ +".sayi:");
            int number=input.nextInt();
            if(number==1){
                break;
            }
            if(number==0){
                result=0;
                break;
            }

            result*=number;
        }
            System.out.println("girdiğiniz sayilarin çarpımı:"+result);

        }

    static void divided(){
        System.out.print("Kaç adet sayı gireceksiniz :");
        int a = input.nextInt();
        double result=0.0;
        for(int i=1;i<=a;i++){
            System.out.print(i + ". sayı :");
            double number = input.nextDouble();

            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if(i==1){
                result=number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç:"+result);

    }

    static void power (){
            System.out.print("Taban değeri giriniz :");
            int base = input.nextInt();
            System.out.print("Üs değeri giriniz :");
            int exponent = input.nextInt();
            int result = 1;

            for(int i=1;i<=exponent;i++){
                result*=base;
            }
            System.out.println("Sonuç : " + result);
        }

        static  void factorial(){
            System.out.print("Sayı giriniz :");
            int n = input.nextInt();
            int result = 1;

            for(int i=1;i<=n;i++){
                result*=i;
            }
            System.out.println("Sonuç : " + result);

        }

    static  void mod(){
        System.out.print("Modu alınacak sayıyı giriniz :");
        int n = input.nextInt();
        System.out.print(n + " sayısının kaça modunun alınmasını istiyorsunuz: ");
        int mod = input.nextInt();
        System.out.println(n%mod);
    }

    static  void rectangle(){
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        int shortSide = input.nextInt();
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        int longSide = input.nextInt();
        System.out.println("Dikdörtgenin alanı: " + (shortSide*longSide));
        System.out.println("Dikdörtgenin çevresi" + 2*(shortSide + longSide));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select = -1;
        while (select >= -1) {
            String menu = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme işlemi\n"
                    + "5- Üslü Sayı Hesaplama\n"
                    + "6- Faktoriyel Hesaplama\n"
                    + "7- Mod Alma\n"
                    + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "0- Çıkış Yap";
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
               case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                 case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    select = -2;
                    System.out.println("Çıkış yapılıyor..");
                    break;

            }
        }

    }}
