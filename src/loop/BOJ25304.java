package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ25304 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalPayment = Integer.parseInt(br.readLine());
        int type = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= type; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int eachPrice = Integer.parseInt(st.nextToken());
            int quantity = Integer.parseInt(st.nextToken());

            sum += eachPrice * quantity;
        }
        if (totalPayment == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
