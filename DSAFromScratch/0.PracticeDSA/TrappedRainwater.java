public class TrappedRainwater {

    public static int trappingWater(int heights[]){

        int n = heights.length;
        //left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = heights[0];
        for(int i = 1; i < n; i++){
            leftmax[i] = Math.max(heights[i], leftmax[i - 1]);
        }

        //Right max boundary
        int rightmax[] = new int[heights.length];
        rightmax[n - 1] = heights[n - 1];
        for(int i = n - 2; i >= 0; i--){
            rightmax[i] = Math.max(heights[i], rightmax[i + 1]);
        }

        //waterlevel = min of leftt max , right max
        int trappedwater = 0;
        for(int i = 0; i < heights.length; i++){
            int waterlevel = Math.min(rightmax[i], leftmax[i]);
            
            //trapped water = waterlevel - height[i];
            trappedwater += waterlevel - heights[i];
        }
        return trappedwater;
    }

    public static void main(String[] args) {
        int heights[] = { 4 , 2 , 0 , 6 , 3 , 2 , 5 };
        System.out.println(trappingWater(heights));
    }
}
