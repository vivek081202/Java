public class selection_sort {
    public static void print_array(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        // time complexity = O(n^2)
        int arr[] = {7,8,3,1,2};
        for(int i=0;i<arr.length-1;i++)
        {
            int smallest = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        print_array(arr);
    }
}
