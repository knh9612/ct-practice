package stepup01;

import java.util.Scanner;

public class BOJ1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] a = new int[26];
        char[] charArray = s.toUpperCase().toCharArray();

        for (char c : charArray) {
//            a[Character.getNumericValue(c)-65]++;
//            System.out.println(c - 65);
            a[c - 65]++;
        }
//        for (int i : a) {
//            System.out.println(i + " ");
//        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (max < a[i]) {
                max = a[i];
                ch = (char) (65 + i);
            } else if (max == a[i]) {
                ch = '?';
            }
        }
//        int maxIndex = -1;
//        for (int i = 0; i < 26; i++) {
//            if (a[i] == max) {
//                maxIndex = i;
//            }
//        }

        System.out.println(ch);
    }
}
