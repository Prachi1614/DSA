public class PrintNthFibbonacciNumbers {

    public static int fibb(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int NM1 = fibb(n - 1);
        int NM2 = fibb(n - 2);
        int Fn = NM1 + NM2;
        return Fn;
    }
    public static void main(String[] args) {
        System.out.println(fibb(7));
        System.out.println(fibb(8));
        System.out.println(fibb(9));
        System.out.println(fibb(10));
        System.out.println(fibb(11));
    }
}
