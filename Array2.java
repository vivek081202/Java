import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int num = sc.nextInt(),i;
        int arr[] = new int[num];
        System.out.println("Enter elements of array: ");
        for(i=0;i<num;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Your Elements are: ");
        for (i=0;i<num;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
