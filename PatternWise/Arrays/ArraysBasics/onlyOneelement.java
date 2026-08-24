public class onlyOneelement {

    public static void maxAndin(int arr[]) {

        if (arr.length == 1) {
            System.out.println("The max and the min in an array is : " + arr[0]);
            return;
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The max element in the array is : " + max);
        System.out.println("The min element in the array is : " + min);
    }

    public static void main(String[] args) {
        int arr[] = {7};
        maxAndin(arr);
    }
}
