import java.util.Scanner;

public class Palindrom {

    static boolean isPalindrom(int number){
        int temp=number,reverse=0,lastNumber;
        while (temp!=0){
            lastNumber=temp%10;
            reverse=(reverse*10)+lastNumber;
            temp=temp/10;

        }
        if(reverse==number){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println( isPalindrom(245));


    }


}
