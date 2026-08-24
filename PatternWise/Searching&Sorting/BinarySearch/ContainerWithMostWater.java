package BinarySearch;

public class ContainerWithMostWater {

    public static int MostwaterContainer(int nums[]){
        int maxWater = 0;
        int n = nums.length;

        for(int i = 1; i < n; i++){
           for(int j = i+1; j < n; j++){

            int ht = Math.min(nums[i], nums[j]);
            int bt = j - i;

            int water = ht*bt;
            maxWater = Math.max(water, maxWater);
           }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int nums[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(MostwaterContainer(nums));
    }
}
