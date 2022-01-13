package atcoder;

import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Pair> list_node = new ArrayList<>();
        while (N-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list_node.add(new Pair(x,y));
        }
        double ans = Double.MIN_VALUE;
        int siz = list_node.size();
        for (int i = 0; i < siz; i++) {
            Pair ii = list_node.get(i);
            for (int j = i; j < siz; j++) {
                Pair jj = list_node.get(j);
                double res = Math.sqrt(Math.abs((ii.x - jj.x) * (ii.x - jj.x) + (ii.y - jj.y) * (ii.y - jj.y)));
                ans = Math.max(ans,res);
            }
        }
        System.out.println(ans);
    }
    public static class Pair{
        int x;
        int y;

        public Pair(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int f(int x) {
        int res = x * x + 2 * x + 3;
        return res;
    }
}
