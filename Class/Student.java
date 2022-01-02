package Java.Class;

public class Student {
    int studnetID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfor(){
        System.out.println(studentName + ',' + address);
    }

    // 사용하는 클래스 입장에서 이름 작성
    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

}