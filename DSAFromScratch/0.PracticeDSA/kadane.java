import java.util.Scanner;

public class kadane {

    // public static void kadanes(int arr[]) {
    //     int cs = 0;
    //     int ms = Integer.MIN_VALUE;

    //     for (int i = 0; i < arr.length; i++) {
    //         cs = cs + arr[i];
    //         if (cs < 0) {
    //             cs = 0;
    //         }
    //         ms = Math.max(ms, cs);
    //     }
    //     System.out.println(ms);
    // }

    public static void kadanesAlg(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int start = 0; int end = 0; int tempstart = 0;

        boolean isneg = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                isneg = false;
                break;
            }
            ms = Math.max(arr[i], ms);
        }

        if (isneg) {
            System.out.println(ms);

            for(int i = 0; i < arr.length; i++){
                if(arr[i] == ms){
                    System.out.println("The subarray is : " + arr[i]);
                    break;
                }
            }
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs > ms) {
                ms = cs;
                start = tempstart;
                end = i;
            }

            if (cs < 0) {
                cs = 0;
                tempstart = i + 1;
            }
        }
        System.out.println(ms);
        System.out.print("The subarray is : ");
        for (int i = start; i <= end; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    // public static void optimizedKadane(int arr[]){
    // int cs = 0;
    // int ms = Integer.MIN_VALUE;

    // for(int i = 0; i < arr.length; i++){
    // cs = Math.max(arr[i], cs + arr[i]);

    // ms = Math.max(ms, cs);
    // }
    // System.out.println(ms);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[8];
        System.out.print("Enter the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        kadanesAlg(arr);
        sc.close();
    }
}