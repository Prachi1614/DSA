import java.util.*;
public class ThreeSum {

    public static List<List<Integer>> threeSumming(int arr[]){

        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> temp = new ArrayList<>();

                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);

                        Collections.sort(temp);
                        
                        set.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int arr[] = { -1,0,1,2,-1,-4 };
        System.out.println(threeSumming(arr));
    }
}
