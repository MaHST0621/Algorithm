package atcoder.at2;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        final Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        int pre = Integer.MIN_VALUE;
        boolean flag = true;
        while (N-- > 0) {
            int a = sc.nextInt();
            if (a > pre && flag) {
                pre = a;
            }else {
                flag = false;
            }
        }


        System.out.println(pre);
    }
}
