public class MergeSortOnLL {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    } 

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

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
        return mergedLL.next;
    }

    public Node mergeSort(Node head){
       if(head == null || head.next == null){
        return head;
       }

       Node mid = findMid(head);
       Node righthead = mid.next;
       mid.next = null;

       Node newleft = mergeSort(head);
       Node newright = mergeSort(righthead);

       return merge(newleft , newright);
    }
    public static void main(String[] args) {
        MergeSortOnLL ll = new MergeSortOnLL();
        ll.addFirst(5);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.print();

        ll.head = ll.mergeSort(head);
        ll.print();
    }
}
