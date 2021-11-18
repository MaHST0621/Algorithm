import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class xiaohongshu {
    public static int[] elm = new int[101];
    public static int[] head = new int[101];
    public static int[] next = new int[101];
    public static int index = 0;
    public static void add(int a,int b) {
        elm[index] = a;
        next[index] = head[a];
        head[a] = index++;
    }

    public static int[] checkDependency(int n, int[][] queries) {
        ArrayList<Integer> aList = new ArrayList<>();
        return null;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;
        Arrays.fill(head,-1);
        int n;
        n = Integer.parseInt(in.nextLine().trim());

        int relations_rows = 0;
        relations_rows = in.nextInt();

        for (int i = 0; i < relations_rows ; i++) {
            int b = in.nextInt();
            int a = in.nextInt();
            add(a,b);
        }

        int queries_rows = 0;
        int queries_cols = 0;
        queries_rows = in.nextInt();
        queries_cols = in.nextInt();

        int[][] queries = new int[queries_rows][queries_cols];
        for(int queries_i=0; queries_i<queries_rows; queries_i++) {
            for(int queries_j=0; queries_j<queries_cols; queries_j++) {
                queries[queries_i][queries_j] = in.nextInt();
            }
        }


        res = checkDependency(n, queries);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
