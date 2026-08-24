import java.util.Scanner;

public class LinearSearch2 {

    public static int linearStringSearch(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (key.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the string : " );
       String arr[] = new String[4];

       for(int i = 0; i < arr.length; i++){
        arr[i] = sc.next();
       }
       sc.close();
       
       int index = linearStringSearch(arr, "orange");
       System.out.println(index);

       if(index == -1){
        System.out.println("No string found");
       }
       else{
        System.out.println("The string is at index : " + index);
       }
    }
}
