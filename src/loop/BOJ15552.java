package loop;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ15552 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            int sum = num1 + num2;
            bw.write(Integer.toString(sum));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
