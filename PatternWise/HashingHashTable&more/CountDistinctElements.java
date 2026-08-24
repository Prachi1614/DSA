import java.util.*;

public class CountDistinctElements {

    public static int countElements(int nums[]){
       HashSet<Integer> set = new HashSet();

       for(int i = 0; i < nums.length; i++){
        set.add(nums[i]);
       }

       System.out.print("The distinct elements are : ");
       for(int element : set){
        System.out.print(element + " ");
       }
       System.out.println("");
       return set.size();
    }
    public static void main(String[] args) {
       int nums[] = {4 , 3 , 2 , 5 , 6 , 7 , 3 , 4 , 2 , 1}; 
       System.out.println("Count " + "= " + countElements(nums));
    }
}
