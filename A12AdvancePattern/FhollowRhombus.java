package A12AdvancePattern;

public class FhollowRhombus {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("   ");
            }
            for (int col = 0; col < n; col++) {
                if (col == 0 || col == n - 1 || row == 0 || row == n - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
