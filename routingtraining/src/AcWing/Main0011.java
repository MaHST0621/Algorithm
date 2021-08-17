package AcWing;

import java.util.Arrays;
import java.util.Scanner;

public class Main0011 {
    private static int[] a = new int[4];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        System.out.println(a[3] - a[2]);
        System.out.println(a[3] - a[1]);
        System.out.println(a[3] - a[0]);
    }
}
