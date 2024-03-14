package thisisct.exhaustivesearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String location = br.readLine();
        int n = location.charAt(0);
        int m = location.charAt(1);
        int count = 0;

        // 방향 벡터 설정
        int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
        int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};

        for (int i = 0; i < 8; i++) {
            int x = n - 96 + dx[i];
            int y = m - 48 + dy[i];

            if (1 <= x && x <= 8 && 1 <= y && y <= 8) {
                count++;
            }
        }
        System.out.println(count);

    }
}
