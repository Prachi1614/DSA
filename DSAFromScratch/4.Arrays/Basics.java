import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks [] = new int [50];

        System.out.println("The length of array is : " + marks.length); // This tells about the length of the array

        // System.out.println("Enter the marks:");
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy = " + marks[0]);
        // System.out.println("maths = " + marks[1]);
        // System.out.println("chem = " + marks[2]);

        // marks[0] = marks[0] + 1; // marks could also be updated.
        // System.out.println("phy = " + marks[0]);
         
        // float avg = (marks[0] + marks[1] + marks[2]) / 3.0f;
        // System.out.println("The percentage is : " + avg + "%");
    }
}
