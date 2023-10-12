package examples4;

import java.util.Scanner;

public class Example4 {
    /*
    While icersinde (+) ve (-) ededleri ayri-ayriliqda toplayan bir java proqrami
    while-da Scanner ile String alir Integere parse edir ve aldigi String deyeri !=0 muddetde
    dovr etmesini teleb edirik
    A java program that adds (+) and (-) elements separately in while
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Start entering numbers: ");

        int positivSum = 0;
        int negativeSum = 0;
        int num;
        while ((num = Integer.parseInt(sc.nextLine())) != 0) {
            if (num > 0)
                positivSum = positivSum + num;
            else
                negativeSum += num;

            displayResult(positivSum, negativeSum);
        }
    }

    public static void displayResult(int positiveSum, int negativeSum) {
        if (positiveSum > 0)
            System.out.printf("Sum of positive numbers : %d%n", positiveSum);
        else
            System.out.println("You did not enter any positive numbers: ");

        if (negativeSum < 0)
            System.out.printf("Sum of negative numbers : %d%n", negativeSum);
        else
            System.out.println("You did not enter any negative numbers: ");
    }
}
