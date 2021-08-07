package AcWing;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 质数判定
 */
public class Main01 {
    public boolean isPrime(int n) {
        if (n <= 3) {
            return n > 1;
        }
        // 只有6x-1和6x+1的数才有可能是质数
        if (n % 6 != 1 && n % 6 != 5) {
            return false;
        }
        // 判断这些数能否被小于sqrt(n)的奇数整除
        int sqrt = (int) Math.sqrt(n);
        for (int i = 5; i <= sqrt; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public void check(int num,int count) {
        int result = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= num;i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            int sum = list.get(i) + list.get(i+1) + 1;
            if (list.contains(sum)) {
                result++;
            }
        }
        if (result >= count) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Main01 main01 = new Main01();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int count = scanner.nextInt();
        for (int i = 0; i < count*2;i++) {
            list.add(scanner.nextInt());
        }

        for (int i=0; i < count*2; i=i+2) {
            main01.check(list.get(i),list.get(i+1));
        }
    }
}
