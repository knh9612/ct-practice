package stepup1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] chessPiece = {1, 1, 2, 2, 2, 8};
        String[] split = br.readLine().split(" ");
        int[] compare = new int[6];

        for (int i = 0; i < 6; i++) {
            compare[i] = (chessPiece[i] - Integer.parseInt(split[i]));
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(compare[i] + " ");
        }
    }
}
