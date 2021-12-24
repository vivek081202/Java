import java.util.*;
public class circle {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            double radius,area,pi = 3.14;
            System.out.println("Enter Radius: ");
            radius = sc.nextInt();
            area = pi*radius*radius;
            System.out.print("Area of circle is: "+area);
        }
    }
}
