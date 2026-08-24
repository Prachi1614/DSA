public class MaxSum {

    public static void maxSum(int numbers[]) {
        int Maxsum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currSum = 0;
            for (int j = i; j < numbers.length; j++) {
                currSum += numbers[j];
                System.out.print(currSum + "  ");
                if (Maxsum < currSum) {
                    Maxsum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("The value of the MaxSum is : " + Maxsum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSum(numbers);
    }
}
