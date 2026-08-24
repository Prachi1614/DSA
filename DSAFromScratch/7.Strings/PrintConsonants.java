public class PrintConsonants {

    public static void printConsonants(String str){
        for(int i = 0; i < str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));

            if(ch >= 'a' || ch <= 'z'){
                if(ch!= 'a' && ch!= 'e' && ch!= 'i' && ch!= 'o' && ch!= 'u'){
                    System.out.print(ch + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        String str = "abcdeFghiJklmnopqrstuvwxyz";
        printConsonants(str);
    }
}
