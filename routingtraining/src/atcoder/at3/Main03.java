package atcoder.at3;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        String[] S = sc.nextLine().split(" ");
        String[] T = sc.nextLine().split(" ");
        String[] ans = new String[N];
        int ti = 0;
        for (int i = 0; i < N; i++) {
            if (S[i].equals(T[ti])) {
                ans[i] = "Yes";
                ti++;
            }else {
                ans[i] = "No";
            }
        }

        for (String s : ans) {
            System.out.println(s);
        }
    }
}
