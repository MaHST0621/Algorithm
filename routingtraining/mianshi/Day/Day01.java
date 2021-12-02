package Day;

import java.util.Scanner;

public class Day01 {
    static double findNthDigit(double n) {
        if (n < 10) return n;
        int len = 1;
        while  (true) {
            //该长度下的最大数字
            double max = (Math.pow(10,len) - 1);
            //该长度下的最小数字
            double min = (Math.pow(10,len - 1));
            //该长度下的所有综合
            double count = max - min + 1;
            if (n - count * len <= 0) break;
            n -= count * len;
            len++;
        }
        double mo = (n / len);
        int mod = (n % len) == 0 ? len - 1 : (int) (n % len - 1);
        if (n % len == 0) mo -= 1;
        double num = (int) (Math.pow(10,len - 1)) + mo;
        return Character.getNumericValue(String.valueOf(num).charAt(mod));
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        double res = findNthDigit(sc.nextInt());
        System.out.println(res);
    }
}
