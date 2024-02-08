package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] object = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            boolean isSame = false;
            object[i] = (Integer.parseInt(br.readLine()) % 42);
            for (int j = 0; j < i; j++) {
                if (object[i] == object[j]) {
                    isSame = true;
                }
            }
            if (isSame == false) {
                count++;
            }
        }
        System.out.println(count);

    }
}
