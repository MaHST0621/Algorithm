package atcoder.at3;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char[] strs = str.toCharArray();
        char ex = strs[a - 1];
        strs[a-1] = strs[b - 1];
        strs[b - 1] = ex;
        for (char s : strs) {
            System.out.print(s);
        }
    }
}
