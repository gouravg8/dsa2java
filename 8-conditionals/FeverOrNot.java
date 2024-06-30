import java.util.Scanner;

public class FeverOrNot {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp > 100) {
            System.out.println(temp + " You have fever");
        } else {
            System.out.println(temp + " No fever");
        }
        sc.close();
    }
}
