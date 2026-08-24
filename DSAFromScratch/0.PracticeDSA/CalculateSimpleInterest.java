import java.util.Scanner;
public class CalculateSimpleInterest {
    
    public static double simpleInterest(double p , double r , double t){
        double SI = (p * r * t)/100;
        return SI;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of p : ");
        double p = sc.nextDouble();

        System.out.print("Enter the value of r : ");
        double r = sc.nextDouble();

        System.out.print("Enter the value of t : ");
        double t = sc.nextDouble();

        double result = simpleInterest(p, r, t);
        System.out.println("The SI is : " + result);
        sc.close();
    }
}
