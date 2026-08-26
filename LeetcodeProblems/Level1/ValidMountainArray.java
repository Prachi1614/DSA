public class ValidMountainArray {

    public static boolean isMountain(int arr[]){
        int n = arr.length;
        int left = 0 , right = n - 1;

        while (left < n - 1 && arr[left] < arr[left + 1]) {
            left++;
        }
        while (right > 0 && arr[right] < arr[right - 1]) {
            right--;
        }

        return left > 0 && left == right && right < n - 1;
    }
    public static void main(String[] args) {
        int arr[] = {0 , 2 , 3 , 4 , 5 , 2 , 1 , 0};
        System.out.println(isMountain(arr));
    }
}
