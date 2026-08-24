public class DecToBin {

    public static void decToBin(int num){
        int mynum = num;
        int pow = 0;
        int bin = 0;

        while (num > 0){
            int rem = num % 2;
            bin = bin + (rem * (int)(Math.pow(10, pow)));
            pow++;
            num = num / 2;
        }
        System.out.println("The Binary of the number " + mynum + " is : " + bin);
    }
    public static void main(String[] args) {
        decToBin(10);
    }
}
