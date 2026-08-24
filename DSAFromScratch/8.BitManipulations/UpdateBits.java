public class UpdateBits {

        public static int getBit(int n , int i){
        int bitmask = 1 << i;
        if((n & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setBit(int n , int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearBit(int n , int i){
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateBit(int n, int i , int newBit){
        // if (newBit == 0){
        //     return clearBit(n, i);
        // }
        // else{
        //     return setBit(n, i);
        // }

        n = clearBit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(updateBit(10, 2, 1));
    }
}
