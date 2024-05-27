import java.util.Scanner;

public class next2 {

    public static void getFactorial(int n) {
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getFactorial(n);
    }
}

// int a = 12;
// int b = 2;
// System.out.println(a+b);

// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int sum = (a+b);
// System.out.println(sum);

// int b = sc.nextInt();
// if(a==b){
// System.out.println("eq");
// }
// else if(a>b) {
// System.out.println("a is bigger");
// }
// else{System.out.println("b is bigger");}

// int a = 1;

// while(a <11){
// System.out.println(a);
// a++;