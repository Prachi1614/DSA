public class PrintNumbersFrom10to1 {

    public static void printnumbs1to10(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printnumbs1to10(n - 1);
    }
    public static void main(String[] args) {
        printnumbs1to10(10);
    }
}
