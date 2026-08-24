import java.util.*;
public class Reverse {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the numer : ");
    int num = sc.nextInt();

    while(num > 0){
       int lastdig = num % 10 ;
       System.out.println(lastdig);
       num = num / 10;
    }
    }
}
