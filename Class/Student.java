package Java.Class;

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    // 생성자 오버로딩
    // 디폴트 생성자
    public Student(){}
    // 아래처럼 값이 들어 있으면 디폴트 생성자가 자동으로 생성이 안됨, 그러므로 직접 선언을 해줘야함
    // 생성자
    public Student(int id, String name){
        studentID = id;
        studentName = name;
    }

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

    public static void main(String[] args){
        // 기본 데이터 타입, 참조형 데이터 타입
        // studentLee, studentKim은 지역변수
        Student studentLee = new Student(100, "이순신");
        studentLee.address = "서울시 영등포구 여의도동";

        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.studentID = 101;
        studentKim.address = "미국 산호세";

        studentLee.showStudentInfor();
        studentKim.showStudentInfor();

        // 주소 확인
        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}