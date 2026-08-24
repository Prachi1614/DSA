import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionWhenNotSortedbyEnd {

    public static int activitySelector(int start[], int end[]) {
        int activity[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        maxAct = 1;
        ans.add(activity[0][0]);
        int prevEnd = activity[0][2];
        for (int i = 1; i < start.length; i++) {
            if (activity[i][1] >= prevEnd) {
                maxAct++;
                ans.add(activity[i][0]);
                prevEnd = activity[i][2];
            }
        }
        for(int i = 0; i < ans.size(); i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
        return maxAct;
    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        System.out.println(activitySelector(start, end));
    }
}
