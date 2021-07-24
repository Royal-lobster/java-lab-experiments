
/**
 * write a java program to search an element using binary search
 */

public class EX_2_A {
    public static void main(String[] args) {
        int[] list = { 22, 34, 45, 67, 89, 100 };
        int toSearch = 34;
        int foundIndex = binarySearch(list, 0, list.length, toSearch);
        if (foundIndex == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + foundIndex);

    }

    private static int binarySearch(int list[], int start, int end, int toSearch) {
        if (end >= start) {
            // calculate mid
            int mid = start + (end - start) / 2;

            // If element is present at the middle itself return mid as index
            if (list[mid] == toSearch)
                return mid;

            // If element is smaller than mid, then search in left sub array
            if (list[mid] > toSearch)
                return binarySearch(list, start, mid - 1, toSearch);

            // If element is larger than mid, then search in right sub array
            if (list[mid] < toSearch)
                return binarySearch(list, mid + 1, end, toSearch);
        }
        // We reach here when element is not present so return -1
        return -1;
    }
}
