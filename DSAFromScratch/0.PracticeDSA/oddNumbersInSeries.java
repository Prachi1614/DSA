import java.util.Scanner;

public class oddNumbersInSeries {

    public static void alloddNumbers(int nums[]){
        
        System.out.print("The odd numbers are : " );
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                System.out.print(nums[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : " );
        int nums[] = new int[10];
        for(int i = 0; i < 10; i++){
            nums[i] = sc.nextInt();
        }

        alloddNumbers(nums);
        sc.close();
    }
}
