package src;

import java.util.Scanner;

public class TX01 {

    static int a[] = new int[10010];

    public static void Eratothenes_init(){
        int round = 10000;
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i <= round; i++){
            if(a[i] != 1){
                for(int j = i * i; j <= round; j += i){
                    a[i] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            Eratothenes_init();
            get_min(n);
        }
    }

    public static void get_min(int n) {
        int m = 1 + n;
        int num = m + n;
        while (!check(m,num*m)) {
            int mm = ((m + 1)*( (m + 1) + n))/4;
            if (num + 1 <= mm) {
                num++;
            }
            else {
                m++;
                num = m + n;
            }
        }
        System.out.println(m*num);
    }

    public static boolean check(int m ,int n) {
        for (int i = 2; i <m ;i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
