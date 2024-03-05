package stepup01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1316_1 {

    /*
        다시 풀어보셈
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = num;

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            boolean[] check = new boolean[26];

            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) != str.charAt(j + 1)) {
                    if (check[str.charAt(j + 1) - 97] == true) {
                        count--;
                        break;
                    }
                }
                check[str.charAt(j) - 97] = true;
            }
        }
        System.out.println(count);

    }
}
