public class MaximumConsequtiveOnesIII {

    public static int maxConsecutiveOnes(int arr[] , int k){
        int left = 0;
        int zerocnt = 0;
        int max = 0;

        for(int right = 0; right < arr.length; right++){
            if (arr[right] == 0) {
                zerocnt++;
            }

            while (zerocnt > k) {
                if(arr[left] == 0){
                    zerocnt--;
                }
                left++;
            }

            int maxLen = right - left + 1;
            max = Math.max(max, maxLen);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;

        System.out.println(maxConsecutiveOnes(arr, k));
    }
}
