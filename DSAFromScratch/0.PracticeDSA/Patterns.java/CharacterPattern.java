public class CharacterPattern {

    public static void characterPattern(int n){
        char ch = 'A';
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= i + 1; j++){
               System.out.print(ch); 
               ch++; 
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        characterPattern(6);
    }
}