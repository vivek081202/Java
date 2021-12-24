import java.util.Scanner;
public class function_table {
    public static void calc_table(int t)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println(t+" "+"*"+" "+i+" = "+t*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter table number: ");
        number = sc.nextInt();
        calc_table(number);
    }
}
