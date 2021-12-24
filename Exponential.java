import java.util.Scanner;
public class Exponential {

    public static int calc_power(int number,int power)
    {
        int exp=0;
        for(int i=1;i<=power;i++)
        {
            exp= number * number;
        }
        return exp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,n;
        System.out.println("Enter value of x: ");
        x = sc.nextInt();
        System.out.println("Enter value of n: ");
        n = sc.nextInt();
        System.out.println("POWER: "+calc_power(x,n));
    }
}
