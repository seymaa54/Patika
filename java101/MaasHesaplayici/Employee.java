package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

 Employee(String name,double salary,int workHours,int hireYear){
   this.name=name;
   this.salary=salary;
   this.workHours=workHours;
   this.hireYear=hireYear;
 }

  double tax(double salary){
    this.salary=salary;
    if(salary>=1000){
      return salary*0.03;
    }
    return 0;
  }

  double bonus(int workHours){
    this.workHours=workHours;
    if(workHours>=40){
        return (workHours-40)*30;
    }
    return 0;
  }

  double raiseSalary(int hireYear){
    int totalYear=2021-hireYear;
    if(totalYear<=10){
       return salary*0.05;
    }
    if(totalYear>=9 && totalYear<= 20){
        return salary*0.1;
    }
    else if(totalYear >=19){
        return salary*0.15;
    }
    return salary;
  }

   public String toString(){

    return "Adı: "+this.name+
           "\nMaaşı: "+this.salary+
           "\nÇalışma Saati: "+this.workHours+
           "\nBaşlangıç Yılı: "+hireYear+
           "\nVergi: "+tax(this.salary)+
           "\nBonus: "+bonus(this.workHours)+
           "\nMaaş Artışı: "+raiseSalary(this.hireYear)+
           "\nVergi ve Bonuslar ile birlikte maaş: "+ ((this.salary+bonus(this.workHours))-this.tax(this.salary))+
           "\nToplam Maaş: "+ (
            (this.salary+bonus(this.workHours)+raiseSalary(this.hireYear))-this.tax(this.salary));


}}
