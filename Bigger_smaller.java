import java.util.*;
public class Bigger_smaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y =sc.nextInt();
        if (x>y)
        {
            System.out.println("X is greater.");
        }
        else if(x<y)
        {
            System.out.println("X is smaller.");
        }
        else if(x==y)
        {
            System.out.println("X is equal.");
        }
    }
}
