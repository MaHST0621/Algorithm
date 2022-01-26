package basick.bignum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description: 高精度板子
 * @author：异想天开的咸鱼
 * @date: 2022/1/26
 */
public class BigNum {


    /**
     * 相加两个大数
     * pre 是进位
     * 预处理：将大数反转过来存入数组中
     * @param num1
     * @param num2
     */
    static void bigNum_add(int[] num1,int[] num2) {
        List<Integer> list = new ArrayList<>();
        int pre = 0;
        for (int i = 0; i < num1.length || i < num2.length; i++) {
            if (i < num1.length) {
                pre += num1[i];
            }
            if (i < num2.length) {
                pre += num2[i];
            }
            list.add(pre % 10);
            pre /= 10;
        }

        if (pre != 0) {
            list.add(pre);
        }
        Collections.reverse(list);
        for (int i : list) {
            System.out.print(i);
        }
    }

    /**
     * 大数相减 必须num1 > num2
     * @param num1
     * @param num2
     */
    static void bigNum_sub(int[] num1,int[] num2) {
        int pre = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num1.length;i++) {
            pre = num1[i] - pre;
            if (i < num2.length) {pre -= num2[i];}
            //(pre + 10) % 10 包含了 pre >= 0 和 pre < 0 的状态
            list.add( (pre + 10) % 10);

            if (pre < 0) {pre = 1;}
            else {pre = 0;}
        }
        while (list.size() > 1 && list.get(list.size() - 1) == 0) {list.remove(list.size() - 1);}
        Collections.reverse(list);
        for (int i : list) {
            System.out.print(i);
        }
    }


    /**
     * 大数乘以小数
     * @param num1
     * @param num2
     */
    static void bigNum_div(int[] num1,int num2) {
        int pre = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num1.length || pre != 0;i++) {
            if (i < num1.length) {pre += num2*num1[i];}
            list.add(pre % 10);
            pre /= 10;
        }

        Collections.reverse(list);
        for (int i : list) {
            System.out.print(i);
        }
    }

    static boolean cmp(int[] num1,int[] num2) {
        if (num1.length > num2.length) {return true;}
        else if (num1.length == num2.length) {
            for (int i = 0;i < num1.length;i++) {
                if (num1[i] < num2[i]) {return false;}
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3};
        int[] num2 = new int[]{3,4,5,5,5,5};

        int[] n1 = new int[num1.length];
        for (int i = 0;i < num1.length;i++) {
            n1[i] = num1[num1.length - i - 1];
        }

        int[] n2 = new int[num2.length];
        for (int i = 0;i < num2.length;i++) {
            n2[i] = num2[num2.length - i - 1];
        }

        bigNum_add(n1,n2);
        System.out.println("");
        System.out.println("--------------------------------------");

        if (cmp(num1,num2)) {
            bigNum_sub(n1,n2);
        }else {
            System.out.print("-");
            bigNum_sub(n2,n1);
        }
        System.out.println("");
        System.out.println("--------------------------------------");
        bigNum_div(n1,12);
    }
}
