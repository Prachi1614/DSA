public class RemoveLinkedListElements {

    public static class Node{
        int data;
        Node next;
       
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeLLelements(Node head , int data) {
        Node dummy = new Node(-1);
        dummy.next = head;

        Node curr = dummy;
        while(curr.next != null){
            if(curr.next.data == data){
               curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return dummy.next;
    }

    public static void print(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(6);

        head = removeLLelements(head, 6);
        print(head);
    }
}
