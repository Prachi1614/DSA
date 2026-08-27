import java.util.Scanner;

class NumArray{
    int [] prefix;

    public NumArray(int arr[]){
        int n = arr.length;
        prefix = new int[n+1];

        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
    }

    public int rangeQuery(int left , int right){
        if(left == 0){
            return prefix[right];
        }
        return prefix[right] - prefix[left - 1];
    }
}
public class RangeSumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = sc.nextInt();
        }

        NumArray NumArray = new NumArray(arr);

        System.out.println("Enter the number of queries : ");
        int q = sc.nextInt();
    
        for(int i = 0; i < q; i++){
           System.out.println("Query " + (i+1) + " : Give left and right index : ");
           int left = sc.nextInt();
           int right = sc.nextInt();
           int result = NumArray.rangeQuery(left, right);
           System.out.println("SumRange of left and right is : " + result);
        }
        sc.close();
    }
}
