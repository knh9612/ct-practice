package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sequence = Integer.parseInt(st.nextToken());
        int standardNum = Integer.parseInt(st.nextToken());
        int[] seq = new int[sequence];
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < sequence; i++) {
            seq[i] = Integer.parseInt(st2.nextToken());
        }
        for (int i : seq) {
            if (i < standardNum) {
                System.out.print(i + " ");
            }
        }
    }
}
