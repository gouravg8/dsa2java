package A12AdvancePattern;

public class D0and1Triangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.err.print(0 + " ");
                }
            }

            System.out.println();
        }
    }
}
