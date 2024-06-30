package A9loops;

import java.util.Scanner;

public class BsumOfInputInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrNums = new int[5];
        int newNum;

        for (int i = 0; i < arrNums.length; i++) {
            newNum = sc.nextInt();
            arrNums[i] = newNum;
        }

        System.out.println("Sum of numbers: ");
        int sum = 0;
        for (int i = 0; i < arrNums.length; i++) {
            sum += arrNums[i];
        }
        System.out.println(sum);
        sc.close();
        // System.out.println("hi");
    }
}
