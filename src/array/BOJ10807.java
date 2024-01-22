package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10807 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int count = 0;

        int[] numArr = new int[num1];
        for (int i = 0; i < num1; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine()); // 반복될 때마다 자르기 시작
            numArr[i] = Integer.parseInt(st.nextToken());
        }
//        for (int i : numArr) System.out.println(i);

        for (int i : numArr) {
            if (i == num2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
