package Java.Class;

public class Student02 {
    int studentID;
    String studentName;
    /*int koreaScore;
    int mathScore;
    String koreaSubject;
    String mathSubject;

    int engScore;
    String engSubject;*/
    Subject korea;
    Subject math;

    public Student02(){
        korea = new Subject("국어");
        math = new Subject("수학");
    }
    public Student02(int id, String name){
        studentID = id;
        studentName = name;

        korea = new Subject("국어");
        math = new Subject("수학");
    }
    public void setKorea(int score){
        korea.setScore(score);
    }
    public void setMath(int score){
        math.setScore(score);
    }
    public void showStudentInfo(){
        int total = korea.getScore() + math.getScore();
        System.out.println(studentName+"학생의 총점은 " + total + "점입니다.");
    }
}
