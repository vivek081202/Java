import java.util.*;
public class HackerRank_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int res = 0;
        int i = 0;

        while (i < n) {

            // take first number
            int number = arr[i];
            int count = 1;
            i++;

            // Count all duplicates
            while (i < n && arr[i] == number) {
                count++;
                i++;
            }

            // If we spotted number just 2
            // times, increment
            // result
            if (count >= 2) {
                res = res + count / 2;
            }
        }
        System.out.println(res);
    }
}
