package AcWingWeek.twentyseven;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main02 {

    private static int[][] nums;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        HashSet<Integer> counter = new HashSet<>();
        nums = new int[n][m];
        for (int i = 1; i <= n;i++) {
            for (int j = 1; j <= n; i++) {
                int num = i * j;
                counter.add(num);
                if (counter.size() == k) {
                    System.out.println(num);
                    break;
                }
            }
        }
    }
}
