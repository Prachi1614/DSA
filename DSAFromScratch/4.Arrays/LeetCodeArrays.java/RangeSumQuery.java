public class RangeSumQuery {
    public static int querySum(int array[] , int left , int right){
        int prefix[] = new int[array.length]; 
        prefix[0] = array[0];
        for(int i = 1; i < array.length; i++){
            prefix[i] = prefix[i - 1] + array[i];
        }
        if(left == 0){
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
    public static void main(String[] args) {
        int array[] = {-2 , 0 , 3 , -5 , 2 , -1};
        System.out.println(querySum(array, 0, 2));
    }
}
