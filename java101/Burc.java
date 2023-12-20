import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz gün:");
        int gun=input.nextInt();

        System.out.print("Doğduğunuz ay:");
        int ay=input.nextInt();

        String burc="";
        boolean isError=false;


        if(ay==1){
            if(gun>=1 && gun<=31){
                if(gun<=21){
                    burc="oğlak";}
                else if(gun>21){burc="Kova";}}
            else{isError=true;}}

        if(ay==2){
            if(gun>=1 && gun<=28){
                if(gun<=19){
                    burc="kova";
                }
                else{
                    burc="balık";
                }
            }
            else{
                isError=true;
            }
        }

        if(ay==3){
            if(gun>=1 && gun<=31){
                if(gun<=20){
                    burc="balık";
                }
                else{
                    burc="koç";
                }
            }
            else{
                isError=true;
            }
        }

        if(ay==4){
            if(gun>=1 && gun<=30){
                if(gun<=20){
                    burc="koç";
                }
                else{
                    burc="boğa";
                }
            }
            else{
                isError=true;
            }
        }

        if(ay==5){
            if(gun>=1 && gun<=30){
                if(gun<=21){
                    burc="boğa";
                }
                else{
                    burc="ikizler";
                }
            }
            else{
                isError=true;
            }
        }

        if(ay==6){
            if(gun>=1 && gun<=30){
                if(gun<=22){
                    burc="ikizler";
                }
                else{
                    burc="yengeç";
                }
            }
            else{
                isError=true;
            }
        }

        if(ay==7){
            if(gun>=1 && gun<=31){
                if(gun<=19){
                    burc="kova";
                }
                else{
                    burc="balık";
                }
            }
            else{
                isError=true;
            }
        }

        if(ay==8){
            if(gun>=1 && gun<=31){
                if(gun<=22){
                    burc="yengeç";
                }
                else{
                    burc="aslan";
                }
            }
            else{
                isError=true;
            }
        }

        if(ay==9){
            if(gun>=1 && gun<=31){
                if(gun<=22){
                    burc="aslan";
                }
                else{
                    burc="başak";
                }
            }
            else{
                isError=true;
            }
        }

        if(ay==10){
            if(gun>=1 && gun<=31){
                if(gun<=22){
                    burc="terazi";
                }
                else{
                    burc="akrep";
                }
            }
            else{
                isError=true;
            }
        }

        if(ay==11){
            if(gun>=1 && gun<=30){
                if(gun<=21){
                    burc="akrep";
                }
                else{
                    burc="yay";
                }
            }
            else{
                isError=true;
            }
        }

        if(ay==12){
            if(gun>=1 && gun<=31){
                if(gun<=21){
                    burc="yay";
                }
                else{
                    burc="oğlak";
                }
            }
            else{
                isError=true;
            }
        }

        if(isError==false){
            System.out.println("burcunuz:"+burc);
        }
        else{
            System.out.println("hatalı değer girişi.");
        }








    }}
