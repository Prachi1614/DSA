package TwoPointer;

public class ContainerWithMostWater {

    public static int cWithMWater(int height[]) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while (i < j) {
            int wt = j - i;
            int ht = Math.min(height[i], height[j]);
            int currWater = wt * ht;
            max = Math.max(max, currWater);
       
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(cWithMWater(height));
    }
}
