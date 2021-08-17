package AcWing;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 第K个除数
 */
public class Main09 {
    private static ArrayList<Long> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        int k = scanner.nextInt();

        for (long i = 1; i <= n;i++) {
            if (n%i == 0) list.add(i);
        }

        if (k > list.size()){
            System.out.println(-1);
        }
        System.out.println(list.get(k-1));
    }
}
