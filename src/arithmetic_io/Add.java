package arithmetic_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Add {

    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하면 처리 속도를 빠르게 할 수 있음.
        // 입력값을 받는 것이기 때문에 예외처리는 필수인데 throws를 해서 try catch에 던지면 됨.
        // 이거는 나중에 해보면 좋을 듯.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bufferstr = br.readLine();

        StringTokenizer st = new StringTokenizer(bufferstr, " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        System.out.println(num1 - num2);
    }
}
