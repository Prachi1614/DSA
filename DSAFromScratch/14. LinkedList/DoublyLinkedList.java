public class DoublyLinkedList {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
          head = tail = newNode;
          return;
        }
        
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    } 

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
           head = tail = newNode;
           return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int removeFirst(){
        if(head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            size--;
            int val = head.data;
            head = tail = null;
            return val;
        }

        size--;
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    public int removeLast(){
        if(head == null){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            size--;
            int val = head.data;
            head = tail = null;
            return val;
        }
        
        size--;
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }

    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
       DoublyLinkedList ll = new DoublyLinkedList();
       ll.addFirst(4);
       ll.addFirst(3);
       ll.addFirst(2);
       ll.addFirst(1);
       ll.addLast(5);
       print();

    //    System.out.println(ll.removeFirst());
    //    print();

       ll.removeLast();
       print();
       System.out.println(size);
    }
}
