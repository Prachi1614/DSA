import java.util.HashSet;

public class setoperation {

    public static void operationSet(int nums[] , int nums1[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        System.out.println("The union is : " +set.size());

        set.clear();

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        System.out.print("The intersection element are : ");
        
        int count = 0;
        for(int i = 0; i < nums1.length; i++){
            if(set.contains(nums1[i])){
                count++;
                System.out.print(nums1[i]  + " ");
                set.remove(nums1[i]);
            }
        }

        System.out.println("\nThe intersection is : " +count);
    }
    public static void main(String[] args) {
        int nums[] = {7 , 3 , 9};
        int nums1[] = {6 , 3 , 9 , 2 , 9 , 4};

        operationSet(nums, nums1);
    }
}
