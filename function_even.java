import java.util.Scanner;
public class function_even {
    public static void calc_even(int e)
    {
        if(e%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("ODD");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number;
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        calc_even(number);
    }
}
