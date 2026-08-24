import java.util.*;
public class CountDistinctElements {

    public static int countDis(int nums[]){
       TreeSet <Integer> ts = new TreeSet<>(); 
       for (int it : nums){
        ts.add(it);
       }
       return ts.size();
    }
    public static void main(String[] args) {
        int nums[] = {1 , 2 , 3 , 4 , 5 , 2 , 3 , 2 , 4 , 1};
        System.out.println(countDis(nums));
    }
}
