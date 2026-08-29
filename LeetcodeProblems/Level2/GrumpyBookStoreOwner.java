public class GrumpyBookStoreOwner {

    public static int noGrumpy(int customers[], int grumpy[], int minutes) {
        int satisfiedCust = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                satisfiedCust += customers[i];
            }
        }

        int unsatisfiedCust = 0;
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                unsatisfiedCust += customers[i];
            }
        }

        int add = unsatisfiedCust;
        for (int i = minutes; i < customers.length; i++) {
            if (grumpy[i] == 1) {
                add += customers[i];
            }

            if (grumpy[i - minutes] == 1) {
                add -= customers[i - minutes];
            }

            add = Math.max(add, unsatisfiedCust);
        }
        return add + satisfiedCust;
    }

    public static void main(String[] args) {
        int customers[] = { 1, 0, 1, 2, 1, 1, 7, 5 };
        int grumpy[] = { 0, 1, 0, 1, 0, 1, 0, 1 };
        int minutes = 3;

        System.out.println(noGrumpy(customers, grumpy, minutes));
    }
}
