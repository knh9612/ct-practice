package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] s1 = st.nextToken().split("");
        String[] s2 = st.nextToken().split("");

        String[] new1 = new String[3];
        String[] new2 = new String[3];

        for (int i = 0; i < 3; i++) {
            new1[2 - i] = s1[i];
            new2[2 - i] = s2[i];
        }

        int sum1 = 0;
        int num1;
        int sum2 = 0;
        int num2;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                num1 = Integer.parseInt(new1[i]) * 100;
                num2 = Integer.parseInt(new2[i]) * 100;
            } else if (i == 1) {
                num1 = Integer.parseInt(new1[i]) * 10;
                num2 = Integer.parseInt(new2[i]) * 10;
            } else {
                num1 = Integer.parseInt(new1[i]);
                num2 = Integer.parseInt(new2[i]);
            }
            sum1 += num1;
            sum2 += num2;
        }

        if (sum1 < sum2) {
            System.out.println(sum2);
        } else {
            System.out.println(sum1);
        }

    }
}
