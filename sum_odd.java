import java.util.Scanner;
public class sum_odd {
    public static int calc_sum_odd(int n)
    {
        int sum=0,i;
        for(i=1;i<=n;i++)
        {
            if((i%2)==1)
            {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n : ");
        n = sc.nextInt();
        System.out.println("Sum of n odd numbers: "+ calc_sum_odd(n));
    }
}
