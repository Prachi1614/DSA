public class TilingProblem {

    public static int floorTiling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        //Verticle tiling
        int VNM1 = floorTiling(n - 1);

        //Horizontal tiling
        int HNM2 = floorTiling(n - 2);

        //result
        int totalTiles = VNM1 + HNM2;
        return totalTiles;
    }

    public static void main(String[] args) {
         System.out.println(floorTiling(1));
    }
}
