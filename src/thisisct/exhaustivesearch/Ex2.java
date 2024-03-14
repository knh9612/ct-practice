package thisisct.exhaustivesearch;

import java.io.*;

public class Ex2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
//        int includeThree = 15;
        int count = 0;

        if (N < 3) {
            count = (N + 1) * 1575;
        } else if (N < 13) {
            count = N * 1575 + 3600;
        } else if (N < 23) {
            count = (N - 1) * 1575 + 3600 * 2;
        } else if (N == 23) {
            count = (N - 2) * 1575 + 3600 * 3;
        }
        System.out.println(count);
    }
}
