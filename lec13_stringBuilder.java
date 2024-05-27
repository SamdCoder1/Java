import java.util.*;

public class lec13_stringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // charAt
        System.out.println(sb.charAt(0));

        // setCharAt
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // insert
        sb.insert(2, 'n');
        System.out.println(sb);

        // delete
        sb.delete(2, 3);
        System.out.println(sb);

        // append(add to last)

    }
}