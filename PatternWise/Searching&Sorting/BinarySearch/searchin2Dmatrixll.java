package BinarySearch;

public class searchin2Dmatrixll {

    public static boolean searchmatrix2(int mat[][], int tar) {
        int m = mat.length;
        int n = mat[0].length;

        int sR = 0;
        int sC = n - 1;

        while (sR < m && sC >= 0) {
            if (tar == mat[sR][sC]) {
                return true;
            } else if (tar < mat[sR][sC]) {
                sC--;
            } else {
                sR++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 4, 7, 11, 15 },
                { 2, 5, 8, 12, 19 },
                { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        System.out.println(searchmatrix2(mat, 15));
    }
}
