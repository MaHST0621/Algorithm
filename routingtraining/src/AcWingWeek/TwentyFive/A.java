package AcWingWeek.TwentyFive;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String I = "I ";
        String that = " that";
        String res[] = new String[2];
        res[0] = "hate";
        res[1] = "love";
        int j = 0;
        int re = 0;
        while (--n != 0) {
            System.out.print(I + res[j] +  that + " ");
            j = j == 0 ? 1 : 0;
        }
        System.out.println(I + res[j] + " it");
    }
}
