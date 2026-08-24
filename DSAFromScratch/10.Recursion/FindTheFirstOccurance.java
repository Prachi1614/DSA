public class FindTheFirstOccurance {

    public static int firstOccurAt(int arr[] , int i , int key){
        if(i == arr.length){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }

        return firstOccurAt(arr, i + 1, key);
    }
    public static void main(String[] args) {
        int arr[] = {5 , 3 , 6 , 9 , 5 , 10 , 2 , 5 , 13};
        System.out.println(firstOccurAt(arr, 0, 13));
    }
}
