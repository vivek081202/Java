import java.util.*;
public class even_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}
