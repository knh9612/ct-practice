package stepup1;

public class BOJ25083 {

    public static void main(String[] args) {
        
        /*  
        * 제어문자, 이스케이프 시퀀스
        * 
        * */
        
        String s = "         ,r'\"7\n" +    // \", \n 이 제어문자다.
                "r`-_   ,'  ,/\n" +        // \n 이 제어문자다.
                " \\. \". L_r'\n" +        // \\, \", \n 이 제어문자다.
                "   `~\\/\n" +            // \\, \n 이 제어문자다.
                "      |\n" +            // \n 이 제어문자다.
                "      |";
        System.out.println(s);
    }
}
