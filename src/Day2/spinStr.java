package Day2;

import java.util.Scanner;

public class spinStr {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            String[] inputs = new String[10];

            for(int i = 0; i < inputs.length; i++) {
                inputs[i] = a;
                System.out.println(inputs[i]);
            }
        }

}
