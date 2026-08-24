public class PrimesInRange {

    public static boolean isPrimea(int n){
        if(n == 2){
            return true;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void inrange(int n){
        for(int i = 2; i < n; i++){
            if(isPrimea(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        inrange(20);
    }
}
