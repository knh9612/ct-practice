package thisisct.exhaustivesearch;

import java.io.*;

// Ex1_0 예외처리한 거 이해 즐대 몬하겠네 ㅅㅂ
// 걍 참고하지 말고 알아서 일단 ㄱㄱㄱ
public class Ex1_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");

        int x = 1;
        int y = 1;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};
        String[] direction = {"R", "L", "U", "D"};

        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < direction.length; j++) {
                if (split[i].equals(direction[j])) {
                        x += dx[j];
                        y += dy[j];
                    if (x < 1 || y < 1 || x > n || y > n) {
                        x -= dx[j];
                        y -= dy[j];
                        continue;
                    }
                }
            }

        }
        System.out.println(x + " " + y);
    }
}
