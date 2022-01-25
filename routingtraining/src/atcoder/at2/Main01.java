package atcoder.at2;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int a1 = Integer.parseInt(String.valueOf(str.charAt(0))) * 100 + Integer.parseInt(String.valueOf(str.charAt(1))) * 10 + Integer.parseInt(String.valueOf(str.charAt(2)));
        int a2 = Integer.parseInt(String.valueOf(str.charAt(1))) * 100 + Integer.parseInt(String.valueOf(str.charAt(2))) * 10 + Integer.parseInt(String.valueOf(str.charAt(0)));
        int a3 = Integer.parseInt(String.valueOf(str.charAt(2))) * 100 + Integer.parseInt(String.valueOf(str.charAt(0))) * 10 + Integer.parseInt(String.valueOf(str.charAt(1)));
        System.out.println(a1 + a2 + a3);
    }
}
