package test1;

public class test001 {
    public static void main(String[] args) {
        char[] str = {'a','b','c','d'};
        str[0] = str[3] = 'v';
        System.out.println(str);
    }
}
