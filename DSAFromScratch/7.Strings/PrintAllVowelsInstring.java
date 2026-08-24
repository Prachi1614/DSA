public class PrintAllVowelsInstring {

    public static void printVowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
            }
        }
    }

   public static void main(String[] args) {
        String str = "Prachi";
        printVowels(str);
   }
}
