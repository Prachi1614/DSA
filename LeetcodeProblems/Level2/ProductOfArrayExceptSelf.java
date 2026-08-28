public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int arr[]){
        int n = arr.length;
        int answer[] = new int[n];

        int leftProduct = 1;
        for(int i = 0; i < n; i++){
           answer[i] = leftProduct;
           leftProduct *= arr[i];
        }

        int rightProduct = 1;
        for(int i = n - 1; i >= 0; i--){
            answer[i] *= rightProduct;
            rightProduct *= arr[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 4};
        int res[] = productExceptSelf(arr);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
