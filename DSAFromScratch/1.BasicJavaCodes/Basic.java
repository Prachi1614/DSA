import java.util.*;
public class Basic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // This is used to take a single word input.
           System.out.print(name);

        String value = sc.nextLine(); // This is used to take a line input.
           System.out.print(value);

        int num = sc.nextInt(); // This is used to take a number input.
           System.out.print(num);

        boolean b  = sc.nextBoolean(); // This is used to take a boolean input
           System.out.print(b);

        Float Fr = sc.nextFloat(); // This is used to take a Float input
           System.out.print(Fr);

        byte but = sc.nextByte(); // This is used to take a Byte input
           System.out.print(but);

        double dub = sc.nextDouble(); // This is used to take a Double input
           System.out.print(dub);
    }
}
