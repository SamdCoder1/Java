import java.util.*;

public class lec10Array {
    public static void main(String[] args) {
        // int marks[] = new int[3];
        // marks[0] = 97;
        // marks[1] = 82;
        // marks[2] = 70;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index :" + i);
            }
        }

    }

}
