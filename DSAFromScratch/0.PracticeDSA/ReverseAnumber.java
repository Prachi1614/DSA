public class ReverseAnumber {

    public static void reverseNumber(int n){
        while(n > 0){
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }
        System.out.println();
    }

    public static int reverseDontPrint(int n){
        int reverse = 0;
        while (n > 0){
            int lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n = n/10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        // reverseNumber(34567);
        System.out.println(reverseDontPrint(879674));
    }
}