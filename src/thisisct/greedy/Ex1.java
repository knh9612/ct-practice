package thisisct.greedy;

// 거스름돈
public class Ex1 {

    public static void main(String[] args) {
        int n = 1260;
        int cnt = 0;
        int[] coinTypes = {500, 100, 50, 10};

        for (int i = 0; i < 4; i++) {
            int coin = coinTypes[i];
            cnt += n / coin;
            System.out.println("cnt = " + cnt);
            n %= coin;
            System.out.println("n = " + n);
        }

        System.out.println(cnt);
    }

}
