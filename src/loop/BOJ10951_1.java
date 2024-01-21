package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10951_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cond;

        // 왜 안되지.....;;; cond / br.readLine()
        while ((cond = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(cond);
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            System.out.println(num1 + num2);
        }
    }
}
