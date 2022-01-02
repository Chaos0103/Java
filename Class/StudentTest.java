package Java.Class;

public class StudentTest {
    // 메인 형식은 고정
    public static void main(String[] args){
        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.address = "서울시 서초구 서초동";

        studentLee.showStudentInfor();
    }
}