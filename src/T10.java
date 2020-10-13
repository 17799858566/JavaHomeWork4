import java.util.Scanner;
public class T10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S =input.next();
        char[] s = S.toCharArray();
        rank(s);
        String Y=String.valueOf(s);
        System.out.println("result = "+Y);
    }

    public static void rank(char[] s) {
        char t;
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[j] < s[i]) {
                    t = s[i];
                    s[i] = s[j];
                    s[j] = t;
                }
            }
        }
    }
}




