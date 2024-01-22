package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sequence = new int[num];

        for (int i = 0; i < num; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }
        int maxNum = sequence[0];
        int minNum = sequence[0];

        for (int i = 0; i < num; i++) {
            if (maxNum < sequence[i]) {
                maxNum = sequence[i];
            }
            if (minNum > sequence[i]) {
                minNum = sequence[i];
            }
        }
        System.out.println(minNum + " " + maxNum);
    }
}
