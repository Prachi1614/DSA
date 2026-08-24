public class ClearLastBits {

    public static int clearLastBit(int n , int i){
        int bitmask = (~0) << i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastBit(15, 2));
    }
}
