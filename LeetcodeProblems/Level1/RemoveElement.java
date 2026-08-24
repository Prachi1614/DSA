public class RemoveElement {

    public static int removeval(int arr[] , int val){
        if(arr.length == 0){
            return 0;
        }
        int j = 0;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] != val){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int arr[] = {3 , 2 , 2 , 3};
        int val = 3;

        System.out.println(removeval(arr, val));
    }
}
