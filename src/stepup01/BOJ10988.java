package stepup01;

import java.util.Scanner;

public class BOJ10988 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] split = sc.nextLine().toCharArray();
        int num = split.length;
        int tf = 1;

        for (int i = 0; i <= num / 2; i++, num--) {
            if (split[i] != split[num - 1]) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(tf);
    }
}
