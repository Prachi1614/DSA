public class SquaresOfAsortedArray {

    public static int[] squaresIncrease(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int ans[] = new int[n];
        int pos = n - 1;

        while (i <= j) {
            int left = arr[i] * arr[i];
            int right = arr[j] * arr[j];

            if (left > right) {
                ans[pos--] = left;
                i++;
            } else {
                ans[pos--] = right;
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { -4, -1, 0, 3, 10 };
        int res[] = squaresIncrease(arr);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
