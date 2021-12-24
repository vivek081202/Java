import java.util.*;
public class string_replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String result = "";
        // Replacement by replace() function;
//        String result = s.replace("e","i");
//        System.out.println(result);
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='e')
            {
                result = result + 'i';
            }
            else {
                result += s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
