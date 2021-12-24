import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter table number: ");
        number = sc.nextInt();
        for (int i = 1;i<=10;i++)
        {
            System.out.print(number);
            System.out.print(" *");
            System.out.print(" ");
            System.out.print(i);
            System.out.print(" ");
            System.out.print("=");
            System.out.print(" ");
            System.out.println(number*i);
        }
    }
}
