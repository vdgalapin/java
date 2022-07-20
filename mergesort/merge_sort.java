package mergesort;

public class merge_sort {
    
    static void merge(int[] arr, int left, int middle, int right) {

        int arr_1_length = middle - left + 1;
        int arr_2_length = right - middle;

        int[] arr1 = new int[arr_1_length];
        int[] arr2 = new int[arr_2_length];


        for(int arr1_index = 0; arr1_index < arr_1_length; arr1_index++) {
     
            arr1[arr1_index] = arr[left+ arr1_index];
        }

        for(int arr2_index = 0; arr2_index < arr_2_length; arr2_index++) {
            arr2[arr2_index] = arr[middle + 1 + arr2_index];
        }

        // Indearr1_index for the two new list
        int arr1_index = 0, arr2_index = 0;

        // Starting of the original list
        int  arr_index = left;
        
        while (arr1_index < arr_1_length && arr2_index < arr_2_length) {
            if(arr1[arr1_index] <= arr2[arr2_index]) {
                arr[arr_index] = arr1[arr1_index];
                arr1_index++;
            } else {
                arr[arr_index] = arr2[arr2_index];
                arr2_index++;
            }
            arr_index++;
        }


        // Copy the rest of the list
        while(arr1_index < arr_1_length) {
            arr[arr_index] = arr1[arr1_index];
            arr_index++;
            arr1_index++;
        }


        while (arr2_index < arr_2_length) {
            arr[arr_index] = arr2[arr2_index];
            arr_index++;
            arr2_index++;
        }

    }

    static void mergesort(int[] arr, int left, int right) {

        if (left < right) {

            int middle = left + (right-left) / 2;
            mergesort(arr, left, middle);
            mergesort(arr, middle + 1, right);
            merge(arr, left, middle, right);

        }
        
    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1};
        int n = arr.length;

        for(int x = 0; x < n; x++) {
            System.out.print(arr[x] + " ");
        }

        System.out.println("");
        mergesort(arr, 0, n - 1);

        for(int x = 0; x < n; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}
