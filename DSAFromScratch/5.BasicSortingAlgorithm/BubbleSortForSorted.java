public class BubbleSortForSorted {

    public static void sortedArrayBubbleSort(int arr[]) {
        int totalSwaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int swaps = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            totalSwaps += swaps;
            if (swaps == 0) {
                break;
            }
        }
        System.out.println("The total no of swaps are : " + totalSwaps);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 4 , 5};
        sortedArrayBubbleSort(arr);
        printArr(arr);

    }
}
