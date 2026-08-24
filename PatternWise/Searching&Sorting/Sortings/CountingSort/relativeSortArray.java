public class relativeSortArray {

    public static void sortRelatively(int arr1[] , int arr2[]){

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr1.length; i++){
           largest = Math.max(largest, arr1[i]);
        }

        int count[] = new int[largest + 1];
        for(int i = 0; i < arr1.length; i++){
            count[arr1[i]]++;
        }
        
        int j = 0;
        for(int i = 0; i < arr2.length; i++){
           int num = arr2[i];
           while(count[num] > 0){
              arr1[j] = num;
              j++;
              count[num]--;
           }
        }

        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr1[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print(int arr1[]){
        for(int i = 0; i < arr1.length; i++){
           System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
        int arr2[] = {2,1,4,3,9,6};

        sortRelatively(arr1, arr2);
        print(arr1);
    } 
}
