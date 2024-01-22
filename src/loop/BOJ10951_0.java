package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10951_0 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cond;

//        br.readLine(); // 이거는 입력을 받는 "행위"
//        (cond = br.readLine() // 입력을 받고 고것을 변수에 담음.

        while ((cond = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(cond);
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            System.out.println(num1 + num2);
        }
    }
}
