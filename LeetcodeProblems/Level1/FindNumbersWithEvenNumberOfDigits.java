public class FindNumbersWithEvenNumberOfDigits {

    public static int evenElements(int arr[]) {
        int evencount = 0;

        for (int i = 0; i < arr.length; i++) {
            int digits = 0;
            while (arr[i] > 0) {
                digits++;

                arr[i] = arr[i] / 10;
            }
            if (digits % 2 == 0) {
                evencount++;
            }
        }
        return evencount;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 345, 2, 6, 7896 };
        System.out.println(evenElements(arr));
    }
}
