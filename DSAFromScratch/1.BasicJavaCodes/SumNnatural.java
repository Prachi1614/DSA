import java.util.*;
public class SumNnatural {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        
        int sum = 0;
        int i = 1;
        while(i <= n){
           sum += i;
           i++; 
        }
        System.out.print("The sum of the 1st " + n + " natural number is : " + sum);
    }
}
