package AcWing;

import java.util.Scanner;

public class Main0012 {
    private static Integer result = 0;
    private static boolean is_sqr(int a) {
        int b = (int) Math.sqrt(a);
        if (b*b == a) {
            return true;
        }
        return false;
    }

//    private static void get_sqr(int count,char[] chars) {
//        for (int i = 0; i < ; i++) {
//            for (int j = i; j < )
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String std = scanner.nextLine();
        char[] chars = std.toCharArray();

        if (is_sqr(Integer.parseInt(std)) == true) {
            System.out.println(result);
        }

        System.out.println("");
    }
}
