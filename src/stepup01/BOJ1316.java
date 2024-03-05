package stepup01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = num;

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            boolean[] check = new boolean[26];

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != str.charAt(j + 1)) {
                    if (check[str.charAt(j + 1) - 97] == true) { // 이미 나온 알파벳이 있으면 그룹단어가 아님
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
