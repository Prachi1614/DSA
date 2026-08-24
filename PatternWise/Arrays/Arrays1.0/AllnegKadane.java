public class AllnegKadane {

    private static boolean isAllneg(int arr[]) {
        boolean allneg = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                allneg = false;
            }
        }
        return allneg;
    }

    public static void kad(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        if (isAllneg(arr)) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {

                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Max is : " + max);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max is : " + ms);
    }

    public static int kadaneOptimized(int arr[]){
        int max = Integer.MIN_VALUE;
        int maxsum = 0;

        for(int i = 0; i < arr.length; i++){
            maxsum += arr[i];
            max = Math.max(maxsum, max);

            if(maxsum < 0){
                maxsum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // int arr[] = { -2, -3, 4, 1, -2, -1, 5, -3 };
        // kad(arr);
        int arr[] = { -2, -3, -4, 1, -2, -1, -5, -3 };
        System.out.println(kadaneOptimized(arr));
    }
}
