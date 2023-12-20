import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        /*
        ğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
         eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile
         aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı,
         lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("kullanıcı adını giriniz:");
        String name=input.nextLine();

        System.out.println("şifrenizi girin:");
        String password=input.nextLine();

        if( password.equals("java101")){
            System.out.println("giriş başarılı");
        }
        else{
            System.out.println("şifre yanlış.Şifrenizi değiştirmek ister misiniz?");
            System.out.print("1-Evet \n2-Hayır\n");
            String operation=input.nextLine();
            String password2;
            if (operation.equalsIgnoreCase("evet") || operation.equals("1")) {
                do{
                    System.out.println("yeni şifreyi giriniz");
                    password2=input.next();
                    if(password2.equals("java101")){
                        System.out.println("Şifre oluşturulamadı,\n" +"lütfen başka şifre giriniz.");
                    }
                    else{
                        System.out.println("şifre başarıyla oluşturuldu");break;
                    }


                }while(!password.equals(password2));

            }

            else{
                System.out.println("şifre yanlış.giriş başarısız");
            }
        }






    }
}