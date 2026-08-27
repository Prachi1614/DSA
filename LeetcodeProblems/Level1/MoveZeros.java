public class MoveZeros {

    public static void zerosAtEnd(int arr[]){
        int n = arr.length;
        int i = 0;

        for(int j = 1; j < n; j++){
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }

    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void solutionTwo(int nums[]){
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {0 , 1 , 0 , 3 , 12};
        // zerosAtEnd(arr);
        solutionTwo(arr);
        print(arr);
    }
}
