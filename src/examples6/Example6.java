package examples6;

import java.util.Scanner;

/*
 Verilen Integer reqemlerin cemini tapmaq mes: 1234 = 10; , 777 = 21;
 */
public class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int num;
        while ((num = Integer.parseInt(sc.nextLine())) != 0) {
            int sumOfNumbersDigits = getDigitsSum(num);
            System.out.printf("The sum of the digits of %d is : %d%n", num, sumOfNumbersDigits);
            System.out.print("Enter a number: ");
        }
        System.out.println("The sum of the digits of the number 0 is 0");
    }

        public static int getDigitsSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
