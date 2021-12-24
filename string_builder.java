import java.util.*;
public class string_builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder word = new StringBuilder("V");
        System.out.println(sb);

        // printing character at index 0
        System.out.println(sb.charAt(0));

        // set char at  index
        sb.setCharAt(0,'l');
        System.out.println(sb);

        // insert
        sb.insert(0,'s');
        System.out.println(sb);

        // delete
        sb.delete(2,4);
        System.out.println(sb);

        // append
        word.append("i");
        word.append("v");
        word.append("e");
        word.append("k");
        System.out.println(word);

        //length
        System.out.println(sb.length());
    }
}
