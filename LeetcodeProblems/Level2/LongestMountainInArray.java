public class LongestMountainInArray {

    public static int longestMountain(int arr[]) {
        int n = arr.length;
        int maxlen = 0;

        int i = 1;
        while (i < n - 1) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i;
                int right = i;

                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }
                maxlen = Math.max(maxlen, right - left + 1);
                i = right;
            }
            i++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 4, 7, 3, 2, 5 };
        System.out.println(longestMountain(arr));
    }
}
