package insertionsort;

import java.util.*;
// import java.io.*;

public class insertion_sort {
    public static void main(String[] args) {
        
        int[] arr = {10, 6, 9, 7, 1};

        System.out.println(Arrays.toString(insertionsort(arr)));
    }
    public static int[] insertionsort(int[] arr) {

        for(int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && key < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;

        }

        return arr;
    }

}