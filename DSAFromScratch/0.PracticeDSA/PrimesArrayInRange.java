public class PrimesArrayInRange {

    public static boolean isPrime(int n){
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

    public static void main(String[] args) {
        int arr[] = {1 , 3 , 7 , 2 , 4 , 9 , 27 , 23};

        for(int i = 0; i < arr.length; i++){
            if(isPrime(arr[i])){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
