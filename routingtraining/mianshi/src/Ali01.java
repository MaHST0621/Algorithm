package src;

import java.util.Scanner;

public class Ali01 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t  = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(check_pair(n, k));
        }
    }

    public static int check_pair(int n,int k) {
        int res = 0;
        res = n - k;
        int i = 2;
        while(n >= k*i) {
            res += n - (k*i);
            i++;
        }
        return res;
    }
}
