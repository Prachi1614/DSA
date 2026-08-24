public class MystringBuilder {

    public static void appendBuilder(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        sb.toString();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "";
        appendBuilder(str);

        // int a = 10; // This cannot be cinverted to String.
        // Integer b = 10; // This can be Converted to String using toString() method.

        // b.toString();

        // char ch = 'a'; // This cannot to converted to String.
        // Character cha = 'a'; // This can be Converted to String using toString()
        // method.

        // cha.toString();
    }
}
