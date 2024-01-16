package arithmetic_io;

public class BOJ10171 {
    public static void main(String[] args) {
        String a = "\\";
        String b = "/";
        String c = ")";
        String d = "(";
        String e = "'";
        String f = "_";
        String g = "|";
        String h = " ";

        System.out.println(
                a + h + h + h + h + b + a + "\n"
                        + h + c + h + h + d + h + e + c + "\n"
                        + d + h + h + b + h + h + c + "\n"
                        + h + a + d + f + f + c + g
        );
    }
}
