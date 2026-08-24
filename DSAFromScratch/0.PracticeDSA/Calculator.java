import java.util.Scanner;

public class Calculator {

    public static double add(double a , double b){
        return a+b;
    }

    public static double subs(double a , double b){
        return a-b;
    }

    public static double multiply(double a , double b){
        return a*b;
    }

    public static double divide(double a , double b){
        if (b == 0){
            System.out.println("Invalid operation");
            return 0;
        }
        return a/b;
    }

    public static double modulo(double a , double b){
        return a%b;
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the a : ");
      int a = sc.nextInt();

      System.out.println("Enter the operator : ");
      int operator = sc.next().charAt(0);

      System.out.println("Enter the b : ");
      int b = sc.nextInt();

      double result = 0;

      switch (operator) {
        case '+':
            result = add(a, b);
            break;
        case '-':
            result = subs(a, b);
            break;
        case '*':
            result = multiply(a, b);
            break;
        case '/':
            result = divide(a, b);
            break;
        case '%':
            result = modulo(a, b);
            break;
      
        default:
        System.out.println("Enter the valid operator");
            break;
      }
      System.out.println(result);
      sc.close();
    }
}