import java.util.*;

// public class lec12_string {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String name = sc.next();

//         System.out.println("Your name is " + name);
//     }
// }

public class lec12_string {
    public static void main(String[] args) {

        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName + lastName;
        System.out.println(fullName.length());

        // chatAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

    }
}