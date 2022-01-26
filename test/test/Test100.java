package test;

public class Test100 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 0; i < 100; i++) {
            a = ++a;
        }
        System.out.println(a);
    }
}
