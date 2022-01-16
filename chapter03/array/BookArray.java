// 객체 배열 만들기 (2)
package Java.chapter03.array;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }
    }
}
