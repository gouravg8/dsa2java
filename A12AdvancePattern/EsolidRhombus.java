package A12AdvancePattern;

public class EsolidRhombus {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("   ");
            }
            for (int col = 0; col < n; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
