package src;

import java.util.*;

public class MeiTuan03 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        List<obb> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            list.add(new obb(a,b,c,d));
            map.put(c,1);
        }

        for (obb o : list) {
            int m = 0;
            if (map.get(o.gr) == o.num) {
                m = o.ge;
                int mm = map.get(o.gr);
                map.put(o.gr,mm+1);
            } else {
                m = Math.max(-k,o.ge-o.de);
            }
            res += m;
        }
        System.out.println(res);
    }
    static class obb{
        private int ge;
        private int de;
        private int gr;
        private int num;

        public obb(int ge,int de,int gr,int num){
            this.ge = ge;
            this.de = de;
            this.gr = gr;
            this.num = num;
        }
    }
}
