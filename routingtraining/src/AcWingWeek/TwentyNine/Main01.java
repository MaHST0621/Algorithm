package AcWingWeek.TwentyNine;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        System.out.printf("%.6f",Math.pow(1.00011,t) * n);

    }
}
