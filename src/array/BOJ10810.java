package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10810 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int pocketNum = Integer.parseInt(st.nextToken());
        int lines = Integer.parseInt(st.nextToken());

        int[] pocket = new int[pocketNum];

        for (int i = 0; i < lines; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st1.nextToken());
            int end = Integer.parseInt(st1.nextToken());
            int ballNum = Integer.parseInt(st1.nextToken());

            while (start <= end) {
                pocket[(start-1)] = ballNum;
                start++;
            }
        }

        for (int i : pocket) {
            System.out.print(i + " ");
        }
    }
}
