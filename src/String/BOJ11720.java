package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int sum = 0;
        String[] split = br.readLine().split("");

        for (String string : split) {
            sum += Integer.parseInt(string);

        }
        System.out.println(sum);
    }
}
