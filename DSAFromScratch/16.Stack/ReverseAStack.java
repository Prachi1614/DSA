import java.util.Stack;
public class ReverseAStack {

    public static void pushAtBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void print(Stack<Integer> s){ 
//Jab ham ye wala print loop likhte hain toh ham original wale stack ko print nahi kara paenge agar karaya toh stack khali ho jaega aur reverse acche se kam nahi karega
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);
        print(s);
    }
}
