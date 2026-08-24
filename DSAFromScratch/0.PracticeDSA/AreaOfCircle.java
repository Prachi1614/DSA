import java.util.Scanner;

public class AreaOfCircle {

    public static int areaOfACircle(int r){
       int Area = (int)(Math.PI*(r*r));
       return Area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius : ");
        int r = sc.nextInt();

        System.out.println(areaOfACircle(r));
        sc.close();
    }
}