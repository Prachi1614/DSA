import java.util.Arrays;

public class LargestSubmatrixWithRearrangements {

    public static int maxOutOfMatrix(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int row = 1; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (matrix[row][col] == 1) {
                    matrix[row][col] += matrix[row - 1][col];
                }
            }
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int row[] = matrix[i].clone();
            Arrays.sort(row);

            for (int j = m - 1; j >= 0; j--) {
                int height = row[j];
                int width = m - j;

                maxArea = Math.max(maxArea, height * width);
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int matrix[][] = {{0 , 0 , 1},
                          {1 , 1 , 1},
                          {1 , 0 , 1}};
        //  int matrix[][] = {{1 , 0 , 1 , 0 , 1}};                  
                        System.out.println(maxOutOfMatrix(matrix));
    }
}
