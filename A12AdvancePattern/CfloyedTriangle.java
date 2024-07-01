package A12AdvancePattern;

public class CfloyedTriangle {
    public static void main(String[] args) {
        int n = 5, count = 1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
