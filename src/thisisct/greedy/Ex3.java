package thisisct.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 숫자 카드 게임
// 행 단위로 가장 낮은 숫자를 비교하여 그 중 가장 큰 수 출력
// 1. 일단 1차원 배열로 ㄱㄱ --> 근데 그러면 행의 개수만큼 배열을 만들어야 하는데 개귀찮은데..?
// 각 행에서 가장 작을 숫자를 담을 변수 선언.
// 행을 받아서 배열에 add
// 이제 그 행에서 가장 작은 숫자를 찾아야 하는데
// 1. sort로 정렬 후 가장 마지막 숫자? 처음 숫자? 찾기
// if로 첫번째 숫자를 넣어서 이것보다 작으면 위에서 선언한 변수에 담기
// 담았다 치고. 이제 고것을 다른 변수에 옮겨서 다른 행과 비교해야 하나?
// 한 번에 못하나?

// 2. 2차원 배열로 ㄱㄱ
public class Ex3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
//        Integer[][] intarr = new Integer[n][m];

        int[] arr = new int[m];
        int min;
        int minMax = 0;


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            min = arr[0];
            if (min >= minMax) {
                minMax = min;
            }
        }
        System.out.println(minMax);

    }
}
