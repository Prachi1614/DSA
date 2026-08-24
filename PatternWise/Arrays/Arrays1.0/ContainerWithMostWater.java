public class ContainerWithMostWater {

    public static int mostWaterContainer(int height[]){
        int n = height.length;
        int lp = 0;
        int rp = n - 1;
        
        int max = 0;
        while(lp < rp){
            int wt = rp - lp;
            int ht = Math.min(height[lp], height[rp]);

            int currwater = wt * ht;
            max = Math.max(max, currwater);

            if(height[lp] < height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int height[] = { 1 , 8 , 6 , 2 , 5 , 4 , 8 , 3 , 7 };
        System.out.println(mostWaterContainer(height));
    }
}
