public class LinearSearch {

    public static int linSearch(int arr[] , int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5 , 4 , 3 , 2 , 1};
        int key = 4;

        int index = linSearch(arr, key);

        if(index != -1){
            System.out.println("Key found at index : " +index);
        }
        else{
            System.out.println("Not in array!");
        }
    }
}
