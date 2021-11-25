package AcWingWeek.TwentySix;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.substring(0,0+3));
        int res = 1;
        for (int i = 1; i < 7; i++) {
            char ch = str.charAt(i);
            if (ch == '1') res += 10;
            else res += Character.getNumericValue(ch);
        }
        System.out.println(res);
    }
}
