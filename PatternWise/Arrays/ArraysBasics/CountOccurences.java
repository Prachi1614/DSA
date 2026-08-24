public class CountOccurences {

    public static int countOccur(int arr[] , int target){

        int count = 0;

        for(int i = 0; i < arr.length; i++){
          if(arr[i] == target){
            count++;
          } 
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2 , 2 , 5 , 5 , 5 , 5 , 5};
        System.out.println(countOccur(arr, 5));
    }
}
