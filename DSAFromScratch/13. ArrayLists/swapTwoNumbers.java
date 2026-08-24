import java.util.*;
public class swapTwoNumbers {

    public static void swap(ArrayList<Integer> list , int num1 , int num2){
        int temp = list.get(num1);
        list.set(num1, list.get(num2));
        list.set(num2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        
        System.out.println(list);
        swap(list, 1 , 3);
        System.out.println(list);
        
    }
}
