import java.util.ArrayList;

public class ActivitySelection {

    public static int moreActivities(int start[] , int end[]){
        int maxAct = 0;
        ArrayList <Integer> ans = new ArrayList<>();
        maxAct = 1;
        ans.add(0);
        int prevEnd = end[0];
        for(int i = 1; i < start.length; i++){
            if(start[i] >= prevEnd){
                maxAct++;
                ans.add(i);
                prevEnd = end[i];
            }
        }
        for(int i = 0; i < ans.size(); i++){
            System.out.print("A"+ans.get(i) + ",");
        }
        System.out.println();
        return maxAct;
    }

    public static void main(String[] args) {
       int start[] = { 1 , 3 , 0 , 5 , 8 , 5 };
       int end[] = { 2 , 4 , 6 , 7 , 9 , 9 };

       System.out.println("MaxAct : " + moreActivities(start, end));
    }
}
