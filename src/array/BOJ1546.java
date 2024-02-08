package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subject = Integer.parseInt(br.readLine());
        int[] scores = new int[subject];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < subject; i++) {
            scores[i] = Integer.parseInt((st.nextToken()));
        }

        // 1. 배열의 원소 중 가장 큰 값 찾기
        int maxScore = scores[0];
        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }
        // 2. 그것을 기준으로 평균 값 구하기
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double convertedAverage = ((double) sum / subject) * 100 / maxScore;
        System.out.print(convertedAverage + " ");
    }
}
