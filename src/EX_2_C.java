
/**
 * write a java program to sort for an element in a given list of elements using
 * merge sort
 */

import java.util.Arrays;

public class EX_2_C {
    public static void main(String[] args) {

        int[] list = { 2, 5, 4, 3, 1, 6, 8, 7, 9, 10 };
        System.out.println("Before : " + Arrays.toString(list));
        mergeSort(list, 0, list.length - 1);
        System.out.println("After : " + Arrays.toString(list));
    }

    private static void mergeSort(int[] list, int start, int end) {
        if (start < end) {
            // find mid point of the list
            int mid = (start + end) / 2;

            // sort the left half recursively
            mergeSort(list, start, mid);

            // sort the right half recursively
            mergeSort(list, mid + 1, end);

            // merge the array at the end of recursion
            merge(list, start, mid, end);
        }
    }

    private static void merge(int[] list, int start, int mid, int end) {
        // create a temporary array to store the sorted elements
        int[] temp = new int[end - start + 1];

        // initialize pointer variables
        int i = start, j = mid + 1, k = 0;

        // compare and copy the elements to the temporary array in sorted order
        while (i <= mid && j <= end) {
            if (list[i] <= list[j]) {
                temp[k++] = list[i++];
            } else {
                temp[k++] = list[j++];
            }
        }

        // copy the remaining elements in the left half to the temporary array
        while (i <= mid) {
            temp[k++] = list[i++];
        }

        // copy the remaining elements in the right half to the temporary array
        while (j <= end) {
            temp[k++] = list[j++];
        }

        // copy the sorted elements back to the original list (Inplace)
        for (i = start, j = 0; i <= end; i++, j++) {
            list[i] = temp[j];
        }
    }
}