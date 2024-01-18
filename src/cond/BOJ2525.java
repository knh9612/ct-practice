package cond;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st1.nextToken());
        int num2 = Integer.parseInt(st1.nextToken());
        int num3 = Integer.parseInt(st2.nextToken());

        // 1
        int hour1 = (num2 + num3) / 60;
        int min2 = (num2 + num3) % 60;
        num1 = num1 + hour1;
        if (num1 / 24 == 0) {
            num2 = min2;
            System.out.println(num1 + " " + num2);
        } else if (num1 / 24 > 0) {
            num1 = num1 - 24;
            num2 = min2;
            System.out.println(num1 + " " + num2);
        }

    }
}
