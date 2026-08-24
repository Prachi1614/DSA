package TwoPointer;

import java.util.*;

public class FourSum {

    public static List<List<Integer>>fourSome(int nums[] , int target){
        List<List<Integer>> res = new ArrayList<>();

        int n = nums.length;

        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1; j < n;){
                int p = j + 1; 
                int q = n - 1;
                while(p < q){
                    long sum = (long)nums[i] + nums[j] + nums[p] + nums[q];
                    if(sum < target){
                       p++;
                    }
                    else if(sum > target){
                        q--;
                    }
                    else{
                        res.add(Arrays.asList(nums[i] , nums[j] , nums[p] , nums[q]));
                        p++;
                        q--;
                        
                        while(p < q && nums[p] == nums[p - 1]){
                            p++;
                        }
                    }
                }
                j++;
                while(j < n && nums[j] == nums[j - 1]){
                    j++;
                }
            }
        }
       return res;
    }
    public static void main(String[] args) {
        int nums[] = {1,0,-1,0,-2,2};
        System.out.println(fourSome(nums, 0));
    }
}
