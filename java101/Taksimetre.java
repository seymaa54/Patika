import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args){
    Scanner giris=new Scanner(System.in);
    int km=giris.nextInt();
    double tutar,perKm=2.20;

    tutar=10 + perKm * km;

    tutar = (tutar <20) ? 20 : tutar;

        System.out.println("You need to pay: "+tutar);
}
}