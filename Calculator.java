import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,opr;
        System.out.println(" ");
        System.out.println("1: + (Addition)");
        System.out.println("2: - (Subtraction)");
        System.out.println("3: * (Multiplication)");
        System.out.println("4: / (Division)");
        System.out.println("5: % (Modulo or remainder)");
        System.out.println(" ");
        System.out.print("Enter Operation: ");
        opr = sc.nextInt();
        System.out.print("Enter Number 1: ");
        num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        num2 = sc.nextInt();

        if(opr==1)
        {
            System.out.print("Addition: ");
            System.out.print(num1+num2);
        }
        else if (opr==2)
        {
            System.out.print("Subtraction: ");
            System.out.print(num1-num2);
        }
        else if(opr==3)
        {
            System.out.print("Multiplication: ");
            System.out.print(num1*num2);
        }
        else if(opr==4)
        {
            System.out.println("Division: ");
            System.out.println(num1/num2);
        }
        else if(opr==5)
        {
            System.out.println("Modulo or Remainder: ");
            System.out.println(num1%num2);
        }
        else
            System.out.println("Wrong operator inserted");
    }
}
