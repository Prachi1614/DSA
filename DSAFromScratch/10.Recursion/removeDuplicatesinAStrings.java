public class removeDuplicatesinAStrings {

    public static void removeDuplicatesString(String str, int idx, boolean map[], StringBuilder newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicatesString(str, idx + 1, map, newStr);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicatesString(str, idx + 1, map, newStr.append(currChar));
        }
    }

    public static void main(String[] args) {
        String str = "appnacollege";
        removeDuplicatesString(str, 0, new boolean [26], new StringBuilder(""));
    }
}
