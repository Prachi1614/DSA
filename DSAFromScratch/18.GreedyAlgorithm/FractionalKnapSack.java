import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {

    public static int knapSackProblem(int weight[] , int value[] , int w){
        
        double ratio[][] = new double[value.length][2];

        for(int i = 0; i < value.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));
        
        int capacity = w;
        int maxQuat = 0;
        for(int i = ratio.length - 1; i >= 0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                maxQuat += value[idx];
                capacity -= weight[idx];
            }
            else{
                maxQuat += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        return maxQuat;
    }
    public static void main(String[] args) {
        int wieght[] = {10 , 20 , 30};
        int value[] = {60 , 100 , 120};
        int w = 50;

        System.out.println(knapSackProblem(wieght, value, w));
    }
}
