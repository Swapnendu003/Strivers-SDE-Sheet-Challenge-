import java.util.ArrayList;

public class pascals
{
	 public static ArrayList<ArrayList<Long>> printPascal(int n) 
	 {
        ArrayList<ArrayList<Long>> triangle = new ArrayList<>();

        if (n <= 0) {
            return triangle;
        }

        // First row of Pascal's triangle
        ArrayList<Long> firstRow = new ArrayList<>();
        firstRow.add(1L);
        triangle.add(firstRow);

        for (int i = 1; i < n; i++) {
            ArrayList<Long> currentRow = new ArrayList<>();
            ArrayList<Long> previousRow = triangle.get(i - 1);

            // First element of the row is always 1
            currentRow.add(1L);

            // Calculate each element in the current row based on the previous row
            for (int j = 1; j < i; j++) {
                long num = previousRow.get(j - 1) + previousRow.get(j);
                currentRow.add(num);
            }

            // Last element of the row is always 1
            currentRow.add(1L);

            // Add the current row to the triangle
            triangle.add(currentRow);
        }

        return triangle;
	 }
     public static void main(String[] args) {
        int N = 4;
        ArrayList<ArrayList<Long>> pascalTriangle = printPascal(N);

        for (ArrayList<Long> row : pascalTriangle) {
            for (Long num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}