package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] sequence = new int[9];
        int maxNum = 0;
        int maxIndex = 0;

        for (int i = 0; i < 9; i++) {
            sequence[i] = Integer.parseInt(br.readLine()); // 입력 받을 때마다 배열에 값을 넣음
        }
        for (int i = 0; i < 9; i++) {
            if (maxNum < sequence[i]) {
                maxNum = sequence[i];
                maxIndex = (i + 1);
            }
        }
        System.out.println(maxNum);
        System.out.println(maxIndex);
    }
}
