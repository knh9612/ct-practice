package arithmetic_io;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] buffer = new String[2];
        for (int i = 0; i < 2; i++) {
            buffer[i] = br.readLine();
        }
        // 일단 배열에 집어 넣었고, buffer[1]의 값을 배열로 표현한 후
        // (10 * 0) * [2],
        // (10 * 1) * [1],
        // (10 * 10) * [0])와 buffer[0]울 각각 곱한 후
        // 다 더해주면 될 듯!

        // for문 돌리면 될 것 같은데, buffer[1]의 값을 배열에 어떻게 넣지 ㅋ.ㅋ

        // 일단 두번째 값을 쪼개서 배열에 담아 줌.
        String[] s = new String[3];
        int result;
        double totalResult = 0;

        //
        for (int i = 0; i <= 2; i++) {
            s = buffer[1].split("");
        }
        for (int i = 0; i <= 2; i++) {
            result = Integer.parseInt(buffer[0]) * Integer.parseInt(s[2-i]);
            System.out.println(result);
            totalResult += Integer.parseInt(buffer[0]) * Integer.parseInt(s[2-i]) * Math.pow(10, i);
        }
        System.out.println((int)totalResult);

    }
}
