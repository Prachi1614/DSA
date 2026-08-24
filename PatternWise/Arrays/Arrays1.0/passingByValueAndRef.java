import java.util.Scanner;

public class passingByValueAndRef {
    public static void byRef(int marks[] , int nonchangable){
        nonchangable = 9;
       for(int i = 0; i < marks.length; i++){
        marks[i] = marks[i] + 1;
       }
    }
    public static void main(String[] args) {
        // callbyValue
        int nonchangable = 8;
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);
        marks[0] = 98;
        marks[1] = 99;
        marks[2] = 96;
        
        byRef(marks , nonchangable);
        System.out.println(nonchangable);
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
