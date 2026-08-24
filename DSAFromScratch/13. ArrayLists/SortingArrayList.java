import java.util.*;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);

        Collections.sort(list);  //Sorts only in ascending Order
        System.out.println(list);


        Collections.sort(list , Collections.reverseOrder());  
        // Collections.reverseOrder() can Sort in descending Order
        System.out.println(list);
    }
}
