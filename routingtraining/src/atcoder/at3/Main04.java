package atcoder.at3;



import java.util.Scanner;

public class Main04 {
    static boolean[] use;
    static long max;
    static long[][] A;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        A = new long[(2 * N) + 1][(2 * N) + 1];
        use = new boolean[(2 * N) + 1];
        for (int i = 1; i <= 2 * N; i++) {
            for (int j = i + 1; j <= (2 * N); j++) {
               A[i][j] = sc.nextInt();
            }
        }
        dfs(N,0,0);
        System.out.println(max);

    }

    static void dfs(int N,int pair_count,long sum) {
        if (pair_count == N) {
            max = Math.max(sum,max);
            return;
        }
        for (int i = 1; i <= 2 * N; i++) {
            if(use[i] == true) continue;
            for (int j = 1; j <= 2*N;j++) {
                if (i != j&& use[i] == false && use[j] == false) {
                    use[i] = true;
                    use[j] = true;
                    dfs(N,pair_count + 1,sum ^ A[i][j]);
                    use[i] = false;
                    use[j] = false;
                }
            }
        }
    }
}
