public class MaxSumPrefixSum {

    public static void prefixSum(int numbers[]){
        int MaxNum = Integer.MIN_VALUE;
        int currSum = 0;
        int Prefix [] = new int [numbers.length];
        
        Prefix[0] = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            Prefix[i] = Prefix[i - 1] + numbers[i];      
        }
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                currSum = i == 0 ? Prefix[j] : Prefix[j] - Prefix[i - 1];
            }
            if(MaxNum < currSum){
                MaxNum = currSum;
            }
        }
        System.out.println("The value of MaxSum is : " + MaxNum);
    }

    public static void main(String[] args) {
        int numbers [] = {1,-2,6,-1,3};
        prefixSum(numbers);
    }
}