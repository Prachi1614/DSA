public class CountSubmatrixwithTopLeftElementLTk {

    public static int countSubmatrix(int arr[][], int k) {
        int rows = arr.length;
        int cols = arr[0].length;

        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (i > 0) {
                    arr[i][j] += arr[i - 1][j];
                }
                if (j > 0) {
                    arr[i][j] += arr[i][j - 1];
                }
                if (i > 0 && j > 0) {
                    arr[i][j] -= arr[i - 1][j - 1];
                }

                if (arr[i][j] >= k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[][] = { { 7, 2, 9 },
                { 1, 5, 0 },
                { 2, 6, 6 } };
        System.out.println(countSubmatrix(arr, 18));
    }
}
