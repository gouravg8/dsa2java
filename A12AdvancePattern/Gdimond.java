package A12AdvancePattern;

public class Gdimond {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // top part
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            for (int start = 0; start <= i; start++) {
                System.out.print("*");
            }
            for (int start = 0; start < i; start++) {
                System.out.print("*");
            }

            // bottom part
            System.out.println();

        }

        // bottom part
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star < (2 * (n - i)); star++) {
                System.out.print("*");
            }
            // for (int star = 0; star < n - i; star++) {
            // System.out.print("*");
            // }
            System.out.println();
        }

    }
}
