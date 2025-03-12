package SORTING;

import Practice.swap;
import java.util.*;

public class selectionSort {
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    swap.swap(arr, i, j);
                }

            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 2, 3, 4, 63, 2, 5, 9, 2 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
