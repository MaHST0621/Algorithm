package AcWing;

import java.util.*;

public class Main0021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int n = sc.nextInt();
            int[] q = new int[n];
            for (int i = 0; i < n; i++) {
                q[i] = sc.nextInt();
                map.put(q[i],i);
            }

        }
    }
}
