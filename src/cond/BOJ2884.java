package cond;

import java.util.Scanner;

public class BOJ2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num2 >= 45) {
            num2 = (num2 - 45);
        } else if (num2 < 45 && num1 == 0) {
            num2 = 60 - (45 - num2);
            num1 = 23;
        } else if (num2 < 45) {
            num2 = 60 - (45 - num2);
            num1 = (num1 - 1);
        }
        System.out.println(num1 + " " + num2);
    }
}
