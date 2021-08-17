package test;

import java.util.Scanner;

public class Money {
    private static int money;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        money = scanner.nextInt();

        int[] a = {100,50,20,10,5,1};

        for (int i = 0; i < a.length; i++) {
            int result = money/a[i];
            money %= a[i];
            System.out.printf("%d 个 %d块钱\n",result ,a[i]);
        }

    }
}
