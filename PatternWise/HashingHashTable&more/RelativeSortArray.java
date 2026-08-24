public class RelativeSortArray {

    public static int[] sortingRelatively(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;

        int max = 0;
        for(int i = 0; i < arr1.length; i++){
           max = Math.max(max, arr1[i]);
        }

        int count[] = new int[max + 1];
        for(int i = 0; i < arr1.length; i++){
            count[arr1[i]]++;
        }

        int j = 0;
        for(int i = 0; i < arr2.length; i++){
            while(count[arr2[i]] > 0){
                arr1[j] = arr2[i];
                j++;
                count[arr2[i]]--;
            }
            
        }

        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr1[j] = i;
                j++;
                count[i]--;
            }
        }
        return arr1;
    }

    public static void print(int arr1[]) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        int[] arr2 = { 2, 1, 4, 3, 9, 6 };
        
        int[] res = sortingRelatively(arr1, arr2);
        print(res);
    }
}
