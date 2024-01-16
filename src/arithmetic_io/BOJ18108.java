package arithmetic_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ18108 {

    public static void main(String[] args) throws IOException {
        // 불기 연도 - 543 = 서기 연도
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int year = Integer.parseInt(st.nextToken());
        System.out.println(year - 543);
    }
}
