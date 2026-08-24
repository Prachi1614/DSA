import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthOfPairChain {

    public static int maxChain(int pairs[][]){
        Arrays.sort(pairs , Comparator.comparingDouble(o -> o[1]));

        int chainlen = 1;
        int chainEnd = pairs[0][1];

        for(int i = 0; i < pairs.length; i++){
            int curr = pairs[i][0];

            if(curr > chainEnd){
                chainlen++;
                chainEnd = pairs[i][1];
            }
        }
        return chainlen;
    }
    public static void main(String[] args) {
        int pairs[][] = {{1 , 2} , {2 , 3} , {3 , 4}};
        System.out.println(maxChain(pairs));
    }
}
