package examples2;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Enter the base number: ");
            int baseNumber = Integer.parseInt(sc.nextLine());

            System.out.println("Enter the power of the number: ");
            int powerOfNumber = Integer.parseInt(sc.nextLine());

            System.out.printf("pow(%d, %d) = %d%n", baseNumber, powerOfNumber, pow(baseNumber, powerOfNumber));
        }
    }

    public static int pow(int baseNumber, int powerOfNumber) {
        if (baseNumber <= 0)
            return 1;

//        2 ^ 4 = 2 * 2 * 2 * 2  There 4 powerOfNumber 2 is a baseNumber
        int result = 1;
        for (int i = 0; i < powerOfNumber; ++i) {
            result *= baseNumber;
        }
        return result;
    }
}
