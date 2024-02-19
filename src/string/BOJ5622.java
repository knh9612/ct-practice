package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5622 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arg = br.readLine().split("");
        int num = arg.length;
        int ascii;
        int sum = 0;

        for (int i = 0; i < num; i++) {
            char c = arg[i].charAt(0);
            ascii = (int) c;
            if (c < 68) {
                sum += 3;
            } else if (c < 71) {
                sum += 4;
            } else if (c < 74) {
                sum += 5;
            } else if (c < 77) {
                sum += 6;
            } else if (c < 80) {
                sum += 7;
            } else if (c < 84) {
                sum += 8;
            } else if (c < 87) {
                sum += 9;
            } else if (c <= 90) {
                sum += 10;
            }
        }
        System.out.println(sum);


    }
}
