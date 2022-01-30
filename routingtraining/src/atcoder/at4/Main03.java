package atcoder.at4;

import java.util.Scanner;

/**
 * @description:
 * @author：异想天开的咸鱼
 * @date: 2022/1/30
 */
public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (check_palindrome(str)) {
            System.out.println("Yes");
        }else{
            System.out.printf("No");
        }

    }

    public static boolean check_palindrome(String str) {
        int len = str.length();
        if (len == 1) {return true;}
        int left = 0;
        for (int i = len - 1;i  >= 0;i--) {
            left = i;
            if (check(str.substring(0,i + 1))){
                break;
            }
        }
        if (left == len - 1) {
            return true;
        }else {
            left++;
            while (left != len) {
                if (str.charAt(left) != 'a') {
                    return false;
                }
                left++;
            }
        }
        return true;
    }


    public static boolean check(String str) {
        int len = str.length();
        if (len == 1) {return true;}
        int left = 0;
        int right = len - 1;
        while (left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
