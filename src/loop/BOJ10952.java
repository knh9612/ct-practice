package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10952 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cond;
        int sum = 0;

        while ((cond = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(cond);
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            sum = num1 + num2;

            if (sum != 0) {
                System.out.println(sum);
            } else {
                return;
            }
        }
    }
}
