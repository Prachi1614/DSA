public class ZigZagLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void zigzag(Node head){
        //Find mid
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        
        //Reverse Second half
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        //Make ZigZag Arrangement
        Node RH = prev;
        Node LH = head;
        Node nextL , nextR;
        
        while(RH != null && LH != null){
            nextL = LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;

            LH = nextL;
            RH = nextR;
        }
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create list: 1 -> 2 -> 3 -> 4 -> 5
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.print("Original: ");
        printList(head);

        zigzag(head);

        System.out.print("ZigZag: ");
        printList(head);
    }
}
