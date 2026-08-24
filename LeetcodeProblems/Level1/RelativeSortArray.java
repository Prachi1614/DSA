public class RelativeSortArray {

    public static int[] relativeSort(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        
        int maxL = 0;
        for (int i = 0; i < n; i++) {
            maxL = Math.max(maxL, arr1[i]);
        }

        int count[] = new int[maxL + 1];
        for (int i = 0; i < n; i++) {
            count[arr1[i]]++;
        }

        int j = 0;
        for (int i = 0; i < m; i++) { // 2, 1, 4, 3, 9, 6
            int num = arr2[i];
            while (count[num] > 0) {
                arr1[j] = num;
                j++;
                count[num]--;
            }
        }

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr1[j] = i;
                j++;
                count[i]--;
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        int arr2[] = { 2, 1, 4, 3, 9, 6 };

        int res[] = relativeSort(arr1, arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
