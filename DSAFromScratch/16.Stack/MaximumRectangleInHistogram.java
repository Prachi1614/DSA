import java.util.Stack;

public class MaximumRectangleInHistogram {

    public static void maximumRectangle(int arr[]) {
        Stack<Integer> s = new Stack<>();

        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        int maxArea = 0;

        // next smaller right
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s.clear();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // Calculate maximum Area
        for (int i = 0; i < arr.length; i++) {
            int ht = arr[i];
            int wt = nsr[i] - nsl[i] - 1;
            int currArea = ht * wt;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("The maximum area of histogram is : " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        maximumRectangle(arr);
    }
}