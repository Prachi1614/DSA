import java.util.LinkedList;

public class FindTheMiddleOfLinkedList {

    public static int mid(LinkedList<Integer> ll){
        int slow = 0;
        int fast = 0;

        while (fast != ll.size() && fast + 1 != ll.size()) {
            fast += 2;
            slow++;
        }

        return ll.get(slow);
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        System.out.println(mid(ll));
    }
}
