import java.util.Scanner;
public class circumference_function {

    public static int calc_circumference(int r)
    {
        int c,PI =22;
        c = (2*PI*r)/7;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius;
        System.out.print("Enter radius of circle: ");
        radius = sc.nextInt();
        System.out.print("Circumference : "+calc_circumference(radius));
    }
}
