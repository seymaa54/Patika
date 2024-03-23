package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut","TRH","90123");
        Teacher t2=new Teacher("Graham Bell","FZK","0011");
        Teacher t3=new Teacher("Mendel","BIO","1212");

        Course tarih=new Course("Tarih","101","TRH");
        Course fizik=new Course("Fizik","101","FZK");
        Course bio=new Course("Bio","101","BIO");

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        bio.addTeacher(t3);

        Student s1=new Student("Seyma","123","4",tarih,fizik,bio);
        s1.addBulkExamNote(100,78,50);
      s1.isPass();
        System.out.println("===============");
        Student s2=new Student("Nisa","456","3",tarih,fizik,bio);
        s2.addBulkExamNote(50,30,70);
        s2.isPass();


    }
}
