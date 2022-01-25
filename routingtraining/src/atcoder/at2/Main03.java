package atcoder.at2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] querry = new int[Q];
        int[] nums = new int[N];
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < N;i++) {
            nums[i] = sc.nextInt();
            if ( !map.containsKey(nums[i])) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }else {
                List<Integer> list = map.get(nums[i]);
                list.add(i);
            }
        }

        for (int i = 0; i < Q; i++) {
            int x = sc.nextInt();
            int k = sc.nextInt();

            if (!map.containsKey(x)) {
                querry[i] = -1;
            }else {
                List<Integer> list = map.get(x);
                if (list.size() < k) {
                    querry[i] = -1;
                }else {
                    querry[i] = list.get(k - 1) + 1;
                }
            }
        }

        for (int i : querry) {
            System.out.println(i);
        }


    }
}
