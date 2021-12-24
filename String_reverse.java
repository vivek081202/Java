import java.util.Scanner;
public class String_reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("VIVEK");
        for (int i=0;i<sb.length()/2;i++)
        {
            int front = i;
            int back = sb.length()-1-i;
            char front_char = sb.charAt(front);
            char back_char = sb.charAt(back);
            sb.setCharAt(front,back_char);
            sb.setCharAt(back,front_char);
        }
        System.out.println(sb);
    }
}
