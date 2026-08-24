public class TableCalculator {
    public static void table(int n , int i){
        if(i == 0){
            return ;
        }
        System.out.println(n * i);
        table(n, i-1);
    }
    public static void main(String[] args) {
        table(7, 10);

    }    
}
