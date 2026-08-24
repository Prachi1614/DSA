public class CharAtFunction {

    public static void Printchars(String Fullname){
        for(int i = 0; i < Fullname.length(); i++){
           System.out.print(Fullname.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str1 = "Prachi";
        String str2 = "Pandey";

        String Fullname = str1 + " " + str2;
        Printchars(Fullname);
    }
}
