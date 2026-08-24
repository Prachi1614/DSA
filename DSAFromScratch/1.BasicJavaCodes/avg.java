import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask how many numbers to input
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        double sum = 0;

        // Loop to take n numbers as input
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            double num = sc.nextDouble();
            sum += num;
        }

        // Calculate average
        double average = sum / n;

        // Display result
        System.out.println("The average is: " + average);

        sc.close();
    }
}

