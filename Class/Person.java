package Java.Class;

public class Person {
    int age;
    String name;
    boolean isMarried;
    int child;

    public static void main(String[] args) {
        Person james = new Person();
        james.age = 40;
        james.name = "James";
        james.isMarried = true;
        james.child = 3;

        System.out.println(james.age);
        System.out.println(james.name);
        System.out.println(james.isMarried);
        System.out.println(james.child);
    }
}
