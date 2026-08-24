package TwoPointer;

public class SortColours {

    public static void optimizedSortColour(int arr[]){
        int count0 = 0; 
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count0++;
            }
            else if(arr[i] == 1){
                count1++;
            }
            else{
                count2++;
            }
        }
        int idx = 0;
        for(int i = 0; i < count0; i++){
           arr[idx++] = 0; 
        }
        for(int i = 0; i < count1; i++){
            arr[idx++] = 1;
        }
        for(int i = 0; i < count2; i++){
            arr[idx++] = 2;
        }
    }

    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2 , 2 , 1 , 2 , 1 , 0 , 0 , 1 , 2};
        optimizedSortColour(arr);
        print(arr);
    }
}
