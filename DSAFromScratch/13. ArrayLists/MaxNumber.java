import java.util.ArrayList;

public class MaxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(17);
        list.add(9);
        list.add(33);
        
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < list.size(); i++){
        //     if(list.get(i) > max){
        //         max = list.get(i);
        //     }
        //     //max = Math.max(max , list.get(i));
        // }
        // System.out.println(max);

        int max1 = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            max1 = Math.max(max1 , list.get(i));
        }
        System.out.println(max1);
    }
}
