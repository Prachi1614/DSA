public class RemoveDuplicatesInAString {

    public static void removeDuplicate(String str, StringBuilder sb, int idx, boolean map[]) {
        if (idx == str.length() - 1) {
            System.out.println(sb);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {

            removeDuplicate(str, sb, idx + 1, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, sb.append(currChar), idx + 1, map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicate(str, new StringBuilder(""), 0, new boolean[26]);
    }
}
