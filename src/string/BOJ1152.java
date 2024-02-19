package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ1152 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        List<String> list = new ArrayList<>();
        for (String s : split) {
            if (s != "") {
                list.add(s);
            }
        }
        System.out.println(list.size());

    }

}
