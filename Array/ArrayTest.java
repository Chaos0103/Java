package Java.Array;

public class ArrayTest {
    public static void main(String[] args) {

        int[] numbers;
        numbers = new int[3];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;


        for(int i = 0; i < 3; i++){
            System.out.println(numbers[i]);
        }

        int[] studentIDs = new int[5];

        for(int i = 0; i < studentIDs.length; i++){
            System.out.println(studentIDs[i]);
        }
    }
}