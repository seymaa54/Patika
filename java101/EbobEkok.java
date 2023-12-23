import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz:");
        int n1=input.nextInt();
        System.out.print("İkinci sayiyi giriniz:");
        int n2=input.nextInt();
        int k=0;

        if(n1>n2){
            k=n2;
        }
        else{
            k=n1;
        }
        //ebob
        int i=1,ebob=0,ekok=0;
        while(i<=k){
            if(n1%i==0 && n2%i==0){
                ebob=i;}
            i++;
        }
        System.out.println("Ebob"+"("+n1+","+n2+"):"+ebob);

        int j=1;
        while (j<=n1*n2){
            if(j%n1==0 && j%n2==0){
                ekok=j;break;
            }
            j++;
        }
        System.out.println("Ekok"+"("+n1+","+n2+"):"+ekok);









     /*   for(int i=1;i<=k;i++){
            if(n1%i==0 && n2%i==0){
                System.out.println(i);}}
        System.out.println("----------");

        for(int i=k;i>=1;i--){
            if(n1%i==0 && n2%i==0){
                System.out.println(i);break;
            }
        }
        System.out.println("----------");

        System.out.println("ekok");
        for(int i=1;i<n1*n2;i++){
            if(i%n1==0 && i%n2==0){
                System.out.println(i);
            }
        } */





    }
}