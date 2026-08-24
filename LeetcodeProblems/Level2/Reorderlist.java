public class Reorderlist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reorder(Node head) {
        //Mid
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node mid = slow;
        Node secondHead = mid.next;
        mid.next = null;

        //Reverse
        Node prev = null;
        Node curr = secondHead;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node head2 = prev;

        //Reorder
        Node leftH = head;
        Node rightH = head2;
        Node nextL , nextR;

        while (leftH != null && rightH != null) {
           nextL = leftH.next;
           leftH.next = rightH;
           nextR = rightH.next;
           rightH.next = nextL;

           leftH = nextL;
           rightH = nextR;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        head = reorder(head);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
