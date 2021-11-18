import java.util.*;

public class HUA03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String check = sc.nextLine();
        int num = Integer.parseInt(check.substring(6));
        int[] work = new int[num];
        Arrays.fill(work,-1);
        List<String> group = new LinkedList<>();
        Map<String,List<String>> wo = new HashMap<>();
        wo.put(check,group);
        while (num-- > 0) {
            String[] str = sc.nextLine().split(",");

            for (int i = 0; i < str.length;i++) {
                if (i == 1) {
                    int id = Integer.parseInt(String.valueOf(str[1]));
                    work[id - 1] = Integer.parseInt(str[0].substring(6));
                }
            }
        }

        for (int i = 0; i < work.length; i++) {
            if (work[i] == -1) {
                System.out.println(-1);
                return;
            }
        }
    }
}
