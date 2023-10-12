package examples1;

import java.util.Scanner;

/*
While icerisinde olan num; 0 daxil edilene qeder sum deyiskenini toplama edib cap edecek.
Scanner ile String alir Integere parse edir ve aldigi deyer !=0 muddetde
dovr edecek While-in icine true ya da false boolean bir ifade gele biler yeni
0 olamdigi muddetde her defe true olacaq 0 olsa false olacaq while dongusunen cixmis olacaq
 */
public class Example1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Start entering numbers : ");

        int sum = 0;
        int num;

        while ((num = Integer.parseInt(sc.nextLine())) != 0) {

            sum += num;

            System.out.printf("Sum: %d%n", sum);
        }
    }
}

