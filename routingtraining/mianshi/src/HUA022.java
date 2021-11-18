package src;

import java.util.*;

public class HUA022 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] keys = new int[n];
        int kk = 0;
        Map<Integer,pool> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            keys[kk++] = b;
            map.put(b,new pool(a,b));
        }
        Arrays.sort(keys);
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int us = sc.nextInt();
            if (map.containsKey(us)) {
                map.get(us).check(us);
            }else {
                for (int j = n - 1; j >= 0; j--) {
                    if (map.get(keys[j]).check(us)) break;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            pool p = map.get(keys[i]);
            System.out.println(p.used_id);
            //res += p.used_id * p.size;
        }

        //System.out.println(res);
    }

    static class pool {
        private int count;
        private int size;
        private int used_id;
        private List<desk> list = new ArrayList<>();

        public pool(int count,int size) {
            this.count = count;
            this.size = size;
            this.used_id = count;
            for (int i = 0; i < count; i++) {
                list.add(new desk(size));
            }
        }

        public boolean check(int need) {
            for (int i = count - 1; i >= 0; i --) {
                desk ned = list.get(i);
                if (ned.isUsed(need)) {
                    ned.use_desk(need);
                    used_id = Math.min(used_id,i);
                    return true;
                }
            }
            return false;
        }
    }

    static class desk {
        private int size;
        private boolean used;

        public desk(int size) {
            this.size = size;
        }

        public boolean isUsed(int cop) {
            return size - cop >= 0;
        }

        public void use_desk(int cop) {
            size -= cop;
            used = true;
        }
    }
}
