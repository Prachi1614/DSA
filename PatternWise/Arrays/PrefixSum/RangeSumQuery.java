public class RangeSumQuery {

    public static int range(int arr[] , int left , int right){

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }

        if(left == 0){
        return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
    public static void main(String[] args) {
        int arr[] = {-2 , 0 , 3 , -5 , 2 , -1};
        System.out.println(range(arr, 2, 5));
    }
}
