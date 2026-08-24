import java.util.*;

public class multiDimensionalArrayList {

    public static void multipleArrayList(ArrayList<ArrayList<Integer>> newmainList){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        newmainList.add(list1);
        newmainList.add(list2);
        newmainList.add(list3);

        // System.out.println(newmainList);
        for(int i = 0; i < newmainList.size(); i++){
            ArrayList<Integer> newlist = newmainList.get(i);
            for(int j = 0; j < newlist.size(); j++){
                System.out.print(newlist.get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(5);
        // list1.add(6);
        // mainList.add(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(7);
        // list2.add(8);
        // mainList.add(list2);

        // for (int i = 0; i < mainList.size(); i++) {
        //     ArrayList<Integer> newList = mainList.get(i);
        //     for (int j = 0; j < newList.size(); j++) {
        //         System.out.print(newList.get(j) + " ");
        //     }
        //     System.out.println();
        // }
        multipleArrayList(mainList);
        System.out.println(mainList);
    }
}
