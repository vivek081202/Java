import java.util.Scanner;
public class greater {

    public static int calc_greater(int n1,int n2)
    {
        int great=0;
        if (n1>n2)
        {
            great =n1;
        }
        else if(n2>n1)
        {
            great = n2;
        }
        return great;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Greater no. is: "+ calc_greater(num1,num2));
    }
}
