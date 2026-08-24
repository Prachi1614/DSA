public class PrintSumOfnNaturalNo {

    public static int sumNnaturalNumbers(int n){
        if(n == 1){
            return 1;
        }
        int NM1 = sumNnaturalNumbers(n - 1);
        int Fn = NM1 + n;
        return Fn;
    }
    public static void main(String[] args) {
        System.out.println(sumNnaturalNumbers(5));
    }
}
