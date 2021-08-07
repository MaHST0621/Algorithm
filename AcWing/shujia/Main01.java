package AcWing.shujia;

import java.util.Scanner;

/**
 * 2021-8-3 解码
 * 一种单词加密方式为：
 *     1.记录单词的中心字母，并将该字母在单词中删除。
 *     2.不断重复上述操作，直至单词被完全删除。
 *     3.将记录下的字母依次连接，得到加密后的单词。
 * 解题思路：
 *      1.反推加密，加密后的字符串从后置位开始回复
 */
public class Main01 {
    public String recover(char c , String s) {
        int len = s.length();
        int index = len/2;
        return s.substring(0,index) + c + s.substring(index,s.length());
    }

    public static void main(String[] args) {
        Main01 main01 = new Main01();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String str = scanner.next();
        String result = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            result = main01.recover(str.charAt(i),result);
        }
        System.out.println(result);
    }

}
