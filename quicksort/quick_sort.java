package quicksort;


class quick_sort {

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    static int partition(int[] arr, int low, int high) {
        
        int pivot = arr[high];

        int i = low - 1;

        for(int j = low; j <= high - 1; j++) {

            if (arr[j] < pivot) {

                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quicksort(int[] arr, int low, int high) {
        
        if (low < high) {
            int pivot_index = partition(arr, low, high);
            quicksort(arr, low, pivot_index - 1);
            quicksort(arr, pivot_index + 1, high);
        }
    }
    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 5, 1, 8, 9, 7, 10  };
        int n = arr.length;
        quicksort(arr, 0, n - 1);
        for(int x = 0; x < n; x++) {
            System.out.print(arr[x] + " ");
        }

    }
}
 
