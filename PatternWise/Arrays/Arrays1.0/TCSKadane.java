public class TCSKadane {

    public static void tcsKadane(int arr[]){
        int start = 0;
        int end = 0;
        int tmp = 0;
        
        int cs = arr[0] , ms = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(cs < 0){
                cs = arr[i];
                tmp = i;
            }
            else{
                cs += arr[i];
            }

            if(cs > ms){
                ms = cs;
                start = tmp;
                end = i;
            }
        }
        System.out.println("Max sum is : " + ms);
        System.out.print("The subarray is : " );
        for(int i = start; i <= end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { -2 , -3 , 4 , -1 , -2 , 1 , 5 , -3 };
        tcsKadane(arr);
    }
}
