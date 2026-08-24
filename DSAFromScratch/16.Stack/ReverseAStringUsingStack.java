import java.util.Stack;

public class ReverseAStringUsingStack {

    public static String reverse(String str){
        
        Stack<Character> ch = new Stack<>();
        int idx = 0;
        while(idx <= str.length() - 1){
            ch.push(str.charAt(idx));
            idx++;
        }

        StringBuilder sb = new StringBuilder("");
        while(!ch.isEmpty()){
            char res = ch.pop();
            sb.append(res);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "Helloworld";
        System.out.println(reverse(str));
    }
}
