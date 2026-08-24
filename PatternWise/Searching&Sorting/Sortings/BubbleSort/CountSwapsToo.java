public class CountSwapsToo {

    public static void bubbleswapcount(int arr[]) {
        int n = arr.length;
        int swap = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap++;
                }
            }
        }
        System.out.println("No of swaps are : " + swap);
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 3, 1, 2 };
        bubbleswapcount(arr);
        print(arr);
    }
}
