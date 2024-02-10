package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int num = 0;
        String[] strings = new String[count];

        for (int i = 0; i < count; i++) {
            strings[i] = br.readLine();
        }
        for (String string : strings) {
            String[] split = string.split("");
            System.out.print(split[0] + split[split.length - 1]);
            System.out.println();
        }
    }
}
