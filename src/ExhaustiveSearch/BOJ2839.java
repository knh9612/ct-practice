package ExhaustiveSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 이코테 8장 효율적인 화폐 구성 보고 다시 풀기 ㄱㄱ
* */
public class BOJ2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int suger = Integer.parseInt(br.readLine());
        int count = 0;
        int[] vinyl = {5, 3};

        for (int i = 0; i < vinyl.length; i++) {
            int first = suger / vinyl[i];
            int next = suger % vinyl[i];
            count += first;
            if (i == vinyl.length - 1 && next != 0) {
                count = -1;
                break;
            }
                suger = next;
        }
        System.out.println(count);
    }
}
