public class Quick_sort {
    public  static  int partition(int arr[],int low,int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static  void Q_sort(int arr[],int low,int high)
    {
       if(low<high)
       {
           int pivot = partition(arr,low,high);
           Q_sort(arr,low,pivot-1);
           Q_sort(arr,pivot+1,high);
       }
    }
    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8};
        int n = arr.length;
        Q_sort(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
