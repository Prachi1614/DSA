public class CountFrequency {

    public static void countF(int arr[]) {

        int freq[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.err.println("Frequency of " + i + "->" + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1 , 2 , 2 , 3 , 3 , 3};
        countF(arr);
    }
}
