package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10811 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int basketCount = Integer.parseInt(st.nextToken());
        int reverseCount = Integer.parseInt(st.nextToken());
        int[] baskets = new int[basketCount];
        int[] forReverseBasckets = new int[basketCount];

        // 1. 바구니에 해당 숫자를 지정
        for (int i = 1; i <= basketCount; i++) {
            baskets[i - 1] = i;
            forReverseBasckets[i - 1] = i;
        }

        // 2.
        for (int i = 0; i < reverseCount; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());

            for (int j = x; j <= y; j++) {
                forReverseBasckets[j - 1] = baskets[y - j + x -1];
            }
            for (int k = 0; k < basketCount; k++) {
                baskets[k] = forReverseBasckets[k];
            }
        }

        for (int i = 0; i < basketCount; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}
