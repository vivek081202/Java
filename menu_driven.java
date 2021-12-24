import java.util.*;
public class menu_driven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,marks;
        System.out.println("Press 1 for more input");
        System.out.println("Press 0 to stop");
        System.out.println(" ");
        System.out.println("Enter number: ");
        n = sc.nextInt();
        if(n==1) {
            do {
                System.out.println("Enter Marks out of (100): ");
                marks = sc.nextInt();
            } while(true);
//            if (marks>=90)
//            {
//                System.out.println("This is good");
//            }
        }
        else if(n==0) {
            System.out.println("STOP");
        }
    }
}
