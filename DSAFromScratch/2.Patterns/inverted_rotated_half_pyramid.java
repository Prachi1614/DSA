public class inverted_rotated_half_pyramid {

    public static void invertedPyramid(int n){
        for(int i = 1; i <= n; i++){
            //for empty spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //for stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedPyramid(4);
    }
}
