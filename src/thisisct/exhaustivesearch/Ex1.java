package thisisct.exhaustivesearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 상하좌우
public class Ex1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 1;
        int y = 1;

        String[] split = br.readLine().split(" ");
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            if (s.equals("R")) {
                if (x < n) {
                    x++;
                }
            } else if (s.equals("L")) {
                if (x > 1) {
                    x--;
                }
            } else if (s.equals("D")) {
                if (y < n) {
                    y++;
                }
            } else if (s.equals("u")) {
                if (y > 1) {
                    y--;
                }
            }
        }
        System.out.println(x + " " + y);

    }
}
