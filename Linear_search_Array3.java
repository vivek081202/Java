import java.util.*;
public class Linear_search_Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int size = sc.nextInt(),elements,i;
        int arr[] = new int[size];
        System.out.println("Enter Elements of Array: ");
        for(i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Element x from input array: ");
        int x = sc.nextInt();
        System.out.println();

        for (i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                System.out.println("x found at index: "+ i);
            }
            else if(arr[i]!=x){
                System.out.println(x + " is not found in the array");
            }
        }
    }
}
