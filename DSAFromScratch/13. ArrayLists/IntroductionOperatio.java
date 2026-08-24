import java.util.ArrayList;
public class IntroductionOperatio{
      public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        // Adding elements in the list.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3 , 14);
        System.out.println(list);

        // Get an Element.
        int element = list.get(2);
        System.out.println(element);

        // Delete an element
        list.remove(2);
        System.out.println(list);

        // Set an element in an arraylist
        list.set(2 , 10);
        System.out.println(list);

        // List containing elements
        System.out.println(list.contains(1));
        System.out.println(list.contains(14));
    }
}
