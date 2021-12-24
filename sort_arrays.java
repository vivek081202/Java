import java.util.*;
public class sort_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array declaration
        System.out.println("Enter size of Array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter numbers: ");
        for(int i =0;i<numbers.length;i++)
        {
            numbers[i] = sc.nextInt();
        }
        boolean ascending =true;
        for (int i=0;i<numbers.length-1;i++)
        {
            if(numbers[i]>numbers[i+1])
            {
                ascending = false;
            }

        }
        if(ascending)
        {
            System.out.println("Array is sorted in Ascending order");
        }
        else
        {
            System.out.println("Array is not sorted Ascending order");
        }
    }
}
