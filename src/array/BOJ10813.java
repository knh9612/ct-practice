package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10813 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int basketCount = Integer.parseInt(st1.nextToken());
        int changeCount = Integer.parseInt(st1.nextToken());

        int[] basket = new int[basketCount];
        for (int i = 0; i < basketCount; i++) {
            basket[i] = (i+1);
        }
        int temp;
        for (int i = 0; i < changeCount; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());

            temp = basket[x - 1];
            basket[x - 1] = basket[y - 1];
            basket[y - 1] = temp;
        }

        for (int i = 0; i < basketCount; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
