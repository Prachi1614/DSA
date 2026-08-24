package BinarySearch;

public class Searchin2Dmatrix {

    public static boolean searchMatrix(int mat[][], int tar) {
        int m = mat.length;
        int n = mat[0].length;

        int startRow = 0;
        int endRow = m - 1;

        while (startRow <= endRow) {
            int midRow = startRow + (endRow - startRow) / 2;

            if (tar >= mat[midRow][0] && tar <= mat[midRow][n - 1]) {
                return searchinrow(mat, tar, midRow);
            } else if (tar >= mat[midRow][n - 1]) {
                startRow = midRow + 1;
            } else {
                endRow = midRow - 1;
            }
        }
        return false;
    }

    private static boolean searchinrow(int mat[][], int tar, int row) {
        int n = mat[0].length;

        int startcol = 0;
        int endcol = n - 1;

        while (startcol <= endcol) {
            int mid = startcol + (endcol - startcol) / 2;

            if (tar == mat[row][mid]) {
                return true;
            }
            else if(tar > mat[row][mid]){
                startcol = mid + 1;
            }
            else{
                endcol = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 } };
        System.out.println(searchMatrix(mat, 60));
    }
}
