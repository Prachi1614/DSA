import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJCF {
    /* Queue ek interface hai isliye vo kabhi bhi khud se object nahi bana sakta aur isiliye 
       ArrayDeque aur LinkedList ko implement karta hai object banane k liye aur kaam 
       karne k liye */
    public static void main(String[] args) {
      //Queue <Characher> ch = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
