package A12AdvancePattern;

public class BInvertedHalfTriangle {
    public static void main(String[] args) {
        int n = 4;

        // code for inverted and half triangle
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("   ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
