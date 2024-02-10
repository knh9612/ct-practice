package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());

        for (int i = 0; i < s; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String string = st.nextToken();

            for (int j = 0; j < string.length(); j++) {

                for (int k = 0; k < num; k++) {
                    System.out.print(string.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
