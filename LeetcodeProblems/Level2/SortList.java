public class SortList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node sortingList(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node mid = findMid(head);
        Node rightH = mid.next;
        mid.next = null;

        Node leftpart = sortingList(head);
        Node rightpart = sortingList(rightH);

        return merge(leftpart , rightpart);
    }

    public static Node findMid(Node head){
        Node fast = head.next;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static Node merge(Node head1 , Node head2){
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }
        while(head2 != null){
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }
        return dummyNode.next;
    }
    public static void main(String[] args) {
        Node head = new Node(-1);
        head.next = new Node(5);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(0);

        head = sortingList(head);

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
