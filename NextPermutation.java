import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation {
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {
        int n = permutation.size();

        // Step 1: Find the largest index i such that permutation.get(i) < permutation.get(i+1)
        int i = n - 2;
        while (i >= 0 && permutation.get(i) >= permutation.get(i + 1)) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find the largest index j such that permutation.get(j) > permutation.get(i)
            int j = n - 1;
            while (permutation.get(j) <= permutation.get(i)) {
                j--;
            }

            // Step 3: Swap permutation.get(i) with permutation.get(j)
            Collections.swap(permutation, i, j);
        }

        // Step 4: Reverse the suffix starting from index i+1
        reverse(permutation, i + 1, n - 1);

        return permutation;
    }

    private static void reverse(ArrayList<Integer> permutation, int start, int end) {
        while (start < end) {
            Collections.swap(permutation, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> permutation = new ArrayList<>();
        permutation.add(2);
        permutation.add(1);
        permutation.add(3);
        permutation.add(4);

        System.out.println("Original permutation: " + permutation);

        ArrayList<Integer> nextPermutation = nextPermutation(permutation);
        System.out.println("Next lexicographically greater permutation: " + nextPermutation);
    }
}
