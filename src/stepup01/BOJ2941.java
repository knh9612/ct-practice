package stepup01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.replace("c=", "p");
        str = str.replace("c-", "p");
        str = str.replace("dz=", "p");
        str = str.replace("d-", "p");
        str = str.replace("lj", "p");
        str = str.replace("nj", "p");
        str = str.replace("s=", "p");
        str = str.replace("z=", "p");

        System.out.println(str.length());

    }

}

