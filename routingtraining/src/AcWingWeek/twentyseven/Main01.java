package AcWingWeek.twentyseven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int n = scanner.nextInt();
            if (n <= 9){
                System.out.println(n);
                continue;
            }
            int mod = n % 20;
            int des = n / 10;

            if (mod % 2 == 0) {
                System.out.println(des);
            }else {
                System.out.println(mod - 1);
            }
        }
    }
}
