import java.util.Scanner;

/**
 * PositiveOrNeg
 */
public class PositiveOrNeg {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int inNum = sc.nextInt();
        if (inNum >= 1) {
            System.out.println(inNum + " is positive");
        } else if (inNum == 0) {
            System.out.println(inNum + " is zero");
        } else {
            System.out.println(inNum + " is negetive");
        }
        sc.close();
    }
}