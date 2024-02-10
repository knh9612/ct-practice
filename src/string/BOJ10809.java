package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        for (int i = 97; i <= 122; i++) {
            s.indexOf(i);
            System.out.print(s.indexOf(i) + " ");
        }


    }
}
