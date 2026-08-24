import java.util.Scanner;

public class KadanesAlgorithm {

    public static int kadaneByS(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < arr.length; i++){
            cs += arr[i];

            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        return ms;
    }

    public static void kadanesAlg(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
         

        boolean isneg = true;
        int start = 0; int end = 0; int tempstart = 0;
        for(int i = 0; i < arr.length; i++){
           if(arr[i] > 0){
            isneg = false;
            break;
           }
           ms = Math.max(arr[i], ms);
        }

        if(isneg){
            System.out.println(ms);
            
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == ms){
                    System.out.println("subarray is : " + arr[i]);
                    break;
                }
            }
            return;
        }
        
        for(int i = 0; i < arr.length; i++){
            cs += arr[i];
            if(cs > ms){
                ms = cs;
                start = tempstart;
                end = i;
            }

            if(cs < 0){
                cs = 0;
                tempstart = i + 1;
            }
        }
        System.out.println("The maximum sum subarray is : " + ms);
        System.out.print("The subarray is : " );
        for(int i = start; i <= end; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int kadanesOptimized(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < arr.length; i++){

            cs = Math.max(arr[i], cs + arr[i]);

            ms = Math.max(cs, ms);
        }
        System.out.print("The Max subarray sum is : ");
        return ms;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[8];
        System.out.print("Enter the array : " );
        for(int i = 0; i < arr.length; i++){
           arr[i] = sc.nextInt(); 
        }
       // -2 , -3 , 4 , -1 , -2 , 1 , 5 , -3 
        // kadanesAlg(arr);
        // System.out.println(kadaneByS(arr));
        System.out.println(kadanesOptimized(arr));
        sc.close();
    }
}
