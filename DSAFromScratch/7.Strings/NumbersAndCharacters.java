public class NumbersAndCharacters {

    public static void characterAndNumbers(String str){
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                System.out.print(ch + " ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "123jkhdgcoauAv$#";
        characterAndNumbers(str);
    }
}
