public class BinaryStrings {

    public static void binaryStr( int n , int lastplace , String str ){
        if(n == 0){
            System.out.println(str);
            return;
        }

        binaryStr(n - 1, 0, str+"0");
        if(lastplace == 0){
            binaryStr(n - 1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        binaryStr(3, 0, "");
    }
}
