package basick.datastructure;

import java.util.Scanner;

/**
 * @description: 用数组模拟链表
 * @author：异想天开的咸鱼
 * @date: 2022/1/29
 */
public class List {
    /**
     * 元素值
     */
    private static int[] el;

    /**
     * 元素next指针指向元素的下标
     */
    private static int[] next;


    /**
     * 元素下标
     */
    private static int index = 0;

    /**
     * 链表头节点下标
     */
    private static int head = -1;

    /**
     * 单链表插入头部
     * @param x
     */
    public static void add_head(int x) {
        el[index] = x;
        next[index] = head;
        head = index;
        index++;
    }

    /**
     * 单链表插入K位置
     * @param k 下标
     * @param x 值
     */
    public static void add(int k,int x) {
        el[index] = x;
        next[index] = next[k];
        next[k] = index++;
    }

    /**
     * 删除输入的第K个数后面的数
     * @param k
     */
    public static void remove(int k) {
        next[k] = next[next[k]];
    }

    public static void init() {
        el = new int[100010];
        next = new int[100010];
    }

    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while (m-- > 0) {
            String strs = sc.next();
            if ("H".equals(strs)) {
                add_head(sc.nextInt());
            }else if ("D".equals(strs)) {
                int k = sc.nextInt();
                if (k == 0) {
                    head = next[head];
                    continue;
                }
                remove(k - 1);
            }else {
                add(sc.nextInt() - 1,sc.nextInt());
            }
        }

        for (int i = head;i != -1; i = next[i]) {
            System.out.print(el[i] + " ");
        }
    }
}
