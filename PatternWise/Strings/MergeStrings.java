import java.util.Scanner;

public class MergeStrings {

    public static String merge(String str1, String str2) {
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        int j = 0;
        while (i < str1.length() && j < str2.length()) {
            sb.append(str1.charAt(i++));
            sb.append(str2.charAt(j++));
        }
        while (i < str1.length()) {
            sb.append(str1.charAt(i));
            i++;
        }
        while (j < str2.length()) {
            sb.append(str2.charAt(j));
            j++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Str1 : ");
        String s1 = sc.nextLine();

        System.out.print("Enter the str2 : ");
        String s2 = sc.nextLine();

        String merged = merge(s1, s2);
        System.out.println("The merged String is : " + merged);
        sc.close();
    }
}
