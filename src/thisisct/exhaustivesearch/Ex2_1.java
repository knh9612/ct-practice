package thisisct.exhaustivesearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ts = (N + 1) * 3600 - 1;
        int minute = ts / 60;
        int disSecond = ts % 60;
        int time = minute / 60;
        int disMinute = minute % 60;

//        for ()
//        int i = disSecond / 3;
//        int j = disMinute / 3;
//        int k = time / 3;
//        System.out.println(i * j * k);
    }
}
