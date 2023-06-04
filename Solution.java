import java.util.* ; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
         int low = 0; // Pointer for the region of 0s
    int mid = 0; // Pointer for the region of 1s
    int high = arr.length - 1; // Pointer for the region of 2s

    while (mid <= high) {
        if (arr[mid] == 0) {
            // If the current element is 0, swap it with the element at the low pointer
            int temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;
            low++;
            mid++;
        } else if (arr[mid] == 1) {
            // If the current element is 1, move to the next element in the 1s region
            mid++;
        } else {
            // If the current element is 2, swap it with the element at the high pointer
            int temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;
            high--;
        }
    }
    }
public static void main(String[] args) {
    int[] arr = {2, 0, 1, 1, 0, 2};

    System.out.println("Original array: " + Arrays.toString(arr));

    sort012(arr);

    System.out.println("Sorted array: " + Arrays.toString(arr));
}
}

