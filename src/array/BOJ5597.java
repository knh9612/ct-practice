package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5597 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] studentCount = new int[30];
        int[] absent = new int[2];
        int count = 0;
        int temp;

        for (int i = 1; i <= 28; i++) {
            int num = Integer.parseInt(br.readLine());
            studentCount[num - 1] = num;
        }

        for (int i = 0; i < 30; i++) {
            if (studentCount[i] == 0) {
                absent[count] = (i + 1);
                count++;
            }
        }

        if (absent[0] > absent[1]) {
            temp = absent[0];
            absent[0] = absent[1];
            absent[1] = temp;
        }
        for (int i = 0; i <= 1; i++) {
            System.out.println(absent[i]);
        }
    }
}
