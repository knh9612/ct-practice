package arithmetic_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2588_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int n100 = b/100;
        int n10 = b/10 - n100*10;
        int n1 = b - n100*100 - n10*10;

        int m1 = a * n1;
        int m2 = a * n10;
        int m3 = a * n100;

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

    }
}
