import java.util.Scanner;
public class Vote_eligibility_function {

    public static void calc_eligibility(int a)
    {
        if(a>=18)
        {
            System.out.println("Your are eligible to give vote");
        }
        else
        {
            System.out.println("You can't  give vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your Age: ");
        age = sc.nextInt();
        calc_eligibility(age);
    }
}
