

public class GetSetClearBits {

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
        return n | bitmask;
    }
    
    public static void main(String[] args) {
        //Get ith bit
        System.out.println(setBit(10, 2));
    }
}
