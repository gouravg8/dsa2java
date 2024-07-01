package A12AdvancePattern;

/**
 * H_morePatters
 */
public class H_morePatters {

    public static void main(String[] args) {
        // 1
        // 212
        // 32123
        // 4321234
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int leftCount = i; leftCount >= 1; leftCount--) {
                System.out.print(leftCount);
            }
            for (int rightCount = 2; rightCount <= i; rightCount++) {
                System.out.print(rightCount);
            }
            System.out.println();
        }
    }
}