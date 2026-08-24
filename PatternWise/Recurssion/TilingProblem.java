public class TilingProblem {

    public static int arrangetile(int n){  //2 * n;
        if(n == 0 || n == 1){
            return 1;
        }

        int fnm1 = arrangetile(n - 1);  //Verticle tiles
        int fnm2 = arrangetile(n - 2);  //Horizontal tiles

        return fnm1 + fnm2;  //Total number of ways
    }
    public static void main(String[] args) {
        System.out.println(arrangetile(1));
    }
}
