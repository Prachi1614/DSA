public class LargestOfTheStrings {

    public static String largestOfStrings(String Fruits[]){
        String largest = Fruits[0];
        for(int i = 1; i < Fruits.length; i++){
            if(largest.compareTo(Fruits[i]) < 0){
                largest = Fruits[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String Fruits[] = {"apple" , "mango" , "banana"};
        System.out.println(largestOfStrings(Fruits));
    }
}
