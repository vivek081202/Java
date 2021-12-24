import java.util.*;
public class Names_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of names you want: ");
        int size = sc.nextInt(),i;
        String names[] = new String[size];

        System.out.println("Enter Names: ");
        for (i=0;i< names.length;i++)
        {
            names[i] = sc.next();
        }
        System.out.println();
        System.out.println("Names from input are as follows: ");
        for (i=0;i< names.length;i++)
        {
            System.out.println(names[i]);
        }


    }
}
