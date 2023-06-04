import java.util.Scanner;

public class MaximumSubarraySum {
    public static int maxSubarraySum(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            // Calculate the maximum sum subarray ending at index i
            currentSum = Math.max(0, currentSum + arr[i]);

            // Update the overall maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        int maxSum = maxSubarraySum(arr);
        System.out.println("Maximum sum of subarray: " + maxSum);
    }
}
