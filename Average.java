import java.util.Scanner;
public class Average {

    public static int calc_average(int a,int b,int c)
    {
        int average;
        average = (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        System.out.println("Average: "+ calc_average(num1,num2,num3));

    }
}
