package examples3;

import java.util.Scanner;

public class Example3 {

    /*
              123 --> 321
              1.Step
              reverse = 0;
              num = 123;  100+20+3
              reverse = (0 * 10) + (123 % 10 = 3);
              num = (123 / 10 = 12);

              2.Step
              reverse = 3;
              num = 12;
              reverse = (3 * 10) + (12 % 10 = 2);
              num = (12 / 10 = 1);

              3.Step
              reverse = 32;
              num = 1;
              reverse = (32 * 10 = 320) + (1 % 10 = 1);

              4.Step
              reverse = 321;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num;
        while ((num = Integer.parseInt(sc.nextLine())) != 0) {
            int reverse = getReverse(num);
            System.out.printf("The reverse of %d is %d%n", num, reverse);
            System.out.printf("Enter a number: ");
        }
    }

    public static int getReverse(int num) {
        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse;
    }
}

