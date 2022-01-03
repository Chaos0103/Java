package Java.Class;

public class StudentTest02 {
    public static void main(String[] args){
        Student02 studentJames = new Student02(100, "James");
        studentJames.setKorea(100);
        studentJames.setMath(100);

        Student02 studentTomas = new Student02(101, "Tomas");
        studentTomas.setKorea(80);
        studentTomas.setMath(60);

        studentJames.showStudentInfo();
        studentTomas.showStudentInfo();
    }
}
