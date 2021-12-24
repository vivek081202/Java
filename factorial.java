import java.util.*;
public class factorial {
    public static void calc_factorial(int num)
    {
        if(num<0)
        {
            System.out.println("Invalid number");
            return;
        }
        int fact=1;
        for (int i=num;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        calc_factorial(n);
    }
}
