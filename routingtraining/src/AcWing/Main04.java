package AcWing;

import java.util.*;

/**
 * 构造字符串
 */
public class Main04 {
    private static char a = 'a';
    private static char b = 'b';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count_char = scanner.nextInt();
        char[] result = new char[count_char+4];
        for (int i = 0; i < count_char; i = i + 4) {
            Arrays.fill(result,i,i+2,a);
            Arrays.fill(result,i+2,i+4,b);
        }
        for (int i = 0; i < count_char; i++) {
            System.out.print(result[i]);
        }
    }
}

