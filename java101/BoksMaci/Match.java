package BoksMaci;

import java.util.Random;

public class Match {
Fighter f1;
Fighter f2;
int minWeight;
int maxWeight;

Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
    this.f1=f1;
    this.f2=f2;
    this.minWeight=minWeight;
    this.maxWeight=maxWeight;
}
Random rnd = new Random();  

public void run(){
    if(isCheck()){
      while(this.f1.health>0 && this.f2.health>0){
       
       System.out.println("====YENİ ROUND====");
       int start=rnd.nextInt(2)+1;
       if(start==1){
        this.f2.health=this.f1.hit(f2);
       }
       else{
       this.f1.health=this.f2.hit(f1);
       }
       if (isWin()){
        break;
       }
       System.out.println(this.f1.name + " Sağlık : "+ this.f1.health);
       System.out.println(this.f2.name + " Sağlık : "+ this.f2.health);

       System.out.println(this.f2.health);
      }
    }
    else{
        System.out.println("Sporcuların sikletleri uyuşmuyor.");
    }
}

boolean isCheck(){
    return(this.f1.weight >= minWeight && this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
}

boolean isWin(){
    if(this.f1.health==0){
        System.out.println(this.f2.name +" kazandı ! ");
        return true;
    }
    if(this.f2.health==0){
        System.out.println(this.f1.name +" kazandı ! ");
        return true;
    } 
    return false;
}

}
