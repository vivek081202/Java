import java.util.*;
public class twoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter Columns: ");
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];

        System.out.println("Enter Elements: ");
        for(int i=0;i<rows;i++)
        {
            for (int j =0;j<columns;j++)
            {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
            {
                System.out.print(numbers[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
