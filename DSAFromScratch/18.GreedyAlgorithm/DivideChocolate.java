import java.util.Arrays;
import java.util.Collections;

public class DivideChocolate {

    public static int minimumCostchocdiv(Integer horCost[], Integer verCost[]) {
        Arrays.sort(horCost, Collections.reverseOrder());
        Arrays.sort(verCost, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;
        while (v < verCost.length && h < horCost.length) {
            if (verCost[v] <= horCost[h]) {
                cost += (horCost[h] * vp);
                h++;
                hp++;
            } else {
                cost += (verCost[v] * hp);
                v++;
                vp++;
            }
        }

        while (v < verCost.length) {
            cost += (verCost[v] * hp);
            v++;
            vp++;
        }

        while (h < horCost.length) {
            cost += (horCost[h] * vp);
            h++;
            hp++;
        }
        System.out.print("The cost is : ");
        return cost;
    }

    public static void main(String[] args) {
        Integer horCost[] = { 4, 1, 2 };
        Integer verCost[] = { 2, 1, 3, 1, 4 };
        System.out.println(minimumCostchocdiv(horCost, verCost));
    }
}
