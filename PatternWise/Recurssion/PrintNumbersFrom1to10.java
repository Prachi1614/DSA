public class PrintNumbersFrom1to10 {

    public static void numbersFrom1to10(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        numbersFrom1to10(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        numbersFrom1to10(10);
    }
}
