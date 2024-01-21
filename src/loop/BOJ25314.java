package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ25314 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine()) / 4;
        String type = "int";

        for (int i = 1; i <= num; i++) {
            type ="long " + type;
        }
        System.out.println(type);
    }
}
