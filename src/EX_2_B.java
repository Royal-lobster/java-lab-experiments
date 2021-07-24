
/**
 * write a java program to sort for an element in a given list of elements using bubble sort
 */

import java.util.Arrays;

public class EX_2_B {
    public static void main(String[] args) {
        int[] list = { 9, 7, 8, 6, 5, 4, 3, 2, 1, 0 };
        System.out.println("Before : " + Arrays.toString(list));
        bubbleSort(list);
        System.out.println("After : " + Arrays.toString(list));
    }

    public static void bubbleSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < (list.length - 1) - i; j++) {
                // if left element > right element then swap
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}