import java.util.Scanner;
public class gcd {

    public static int calc_gcd(int a,int b)
    {
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        if (a == b)
            return a;

        if (a > b)
            return calc_gcd(a-b, b);
        return calc_gcd(a, b-a);
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num1,num2;
     num1 = sc.nextInt();
     num2 = sc.nextInt();
        System.out.println("GCD OF 2 numbers is: "+calc_gcd(num1,num2));
    }
}
