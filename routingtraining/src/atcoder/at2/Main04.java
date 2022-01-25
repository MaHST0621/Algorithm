package atcoder.at2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main04 {
    private static int ans = 0;
    private static HashSet<Long> set = new HashSet<>();
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int N = sc.nextInt();
        ans = check(N,a) == true ? ans - 1 : -1;
        System.out.println(ans);
    }

    public static boolean check(int N,int a) {
        Queue<Long> queue = new LinkedList<>();
        queue.add(1L);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ans++;
            for (int i = 0; i < size;i++) {
                long num = queue.poll();
                if (num != N) {
                    long nu = num * a;
                    if ( String.valueOf(N).length() >= String.valueOf(nu).length() && !set.contains(nu)) {
                        queue.add(nu);
                        set.add(nu);
                    }
                    if (num >= 10 && num % 10 != 0) {
                        int len = String.valueOf(num).length();
                        char right = String.valueOf(num).charAt(len - 1);
                        long re_num = Long.parseLong(right + String.valueOf(num).substring(0,len - 1));
                        if (String.valueOf(N).length() >= String.valueOf(re_num).length() && !set.contains(re_num)) {queue.add(re_num);set.add(re_num);}
                    }
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}
