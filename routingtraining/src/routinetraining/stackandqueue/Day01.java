package routinetraining.stackandqueue;
//CD5/LC155. 设计 getMin 功能的栈

/**
 * 第一行输入一个整数N，表示对栈进行的操作总数。
 * 下面N行每行输入一个字符串S，表示操作的种类。
 * 如果S为"push"，则后面还有一个整数X表示向栈里压入整数X。
 * 如果S为"pop"，则表示弹出栈顶操作。
 * 如果S为"getMin"，则表示询问当前栈中的最小元素是多少。
 */

import java.util.Scanner;
import java.util.Stack;

/**
 * 输出描述:
 * 对于每个getMin操作，输出一行表示当前栈中的最小元素是多少。
 */
public class Day01 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    Integer Min;

    void push01(int i) {
        if (stack2.empty()) {
            Min = i;
        }
        Min = Min >= i ? i : Min;
        stack2.push(Min);
        stack1.push(i);
    }

    Integer getMin() {
        return stack2.peek();
    }

    void pop01() {
        stack1.pop();
        stack2.pop();
    }

    public static void main(String[] args) {
        Day01 day01 = new Day01();
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            String Case = scanner.next();
            if ("push".equals(Case)) {
                int num = scanner.nextInt();
                day01.push01(num);
            }
            if ("pop".equals(Case)) day01.pop01();
            if ("getMin".equals(Case)) System.out.println(day01.getMin());
        }
    }
}
