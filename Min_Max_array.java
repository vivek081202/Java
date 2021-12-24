import java.util.*;
public class Min_Max_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = sc.nextInt(),i;
        int numbers[] = new int[size];
        System.out.println("Enter elements of array: ");
        for(i=0;i<size;i++)
        {
            numbers[i] = sc.nextInt();
        }

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        ;
        for(i=0;i<numbers.length;i++)
        {
            if(max>numbers[i])
            {
                max = numbers[i];
            }
            if(min<numbers[i])
            {
                min = numbers[i];
            }
        }
        System.out.println("Minimum: "+ max);
        System.out.print("Maximum: "+min);
    }
}
