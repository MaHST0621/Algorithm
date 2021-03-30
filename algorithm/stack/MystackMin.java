package algorithm.stack;


import java.util.List;
import java.util.Stack;

/**
 * @Author Mahe
 * @Date 2021/2/19 17:40
 * @Version 1.0
 */


/** 该方法是用栈来快速获取一组数列当中的最小值
 * MystackMin 在push时省了空间，但在pop时稍费时间
 * MystackMin2 在push时稍费了空间，但在pop时省了时间
 */
class MystackMin {

    private Stack<Integer> minStack;
    private Stack<Integer> dataStack;

    public MystackMin(){
        this.minStack = new Stack<Integer>();
        this.dataStack = new Stack<Integer>();
    }

    public void push(int newNumber){
        if(this.minStack.isEmpty()){
            this.minStack.push(newNumber);
        }else if(this.minStack.peek() >= newNumber){
            this.minStack.push(newNumber);
        }

        this.dataStack.push(newNumber);
    }

    public int pop(){

        if (this.dataStack.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }

        int value = this.dataStack.peek();

        if (value == this.minStack.peek()){
            this.minStack.pop();
        }

        return value;
    }

    public int getmin(){

        if(this.minStack.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }

        return this.minStack.peek();
    }

};

class MystackMin2 {

    private Stack<Integer> dataStack;
    private Stack<Integer> minStack;

    public MystackMin2(){
        this.minStack = new Stack<Integer>();
        this.dataStack = new Stack<Integer>();
    }

    public void push(int newNumber){
        this.dataStack.push(newNumber);

        if (this.minStack.isEmpty()){
            this.minStack.push(newNumber);
        }else if(this.minStack.peek() >= newNumber){
            this.minStack.push(newNumber);
        }else{
            this.minStack.push(this.minStack.peek());
        }
    }

    public int pop(){
        if (this.dataStack.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }

        this.minStack.pop();
        return this.dataStack.pop();
    }

    public int getmin(){
        if (this.minStack.isEmpty()){
            throw new RuntimeException("Your stack is empty");
        }

        return this.minStack.peek();
    }
};

class Test {
    public static void main(String[] args) {
        MystackMin mystackMin = new MystackMin();
        MystackMin2 mystackMin2 = new MystackMin2();

        mystackMin.push(5);
        mystackMin.push(75);
        mystackMin.push(85);
        mystackMin.push(4);
        mystackMin.pop();

        long startTime = System.nanoTime(); //获取开始时间
        mystackMin.getmin(); //测试的代码段
        long endTime = System.nanoTime(); //获取结束时间

        System.out.println("程序1运行时间：" + (endTime - startTime) + "  " + mystackMin.getmin()); //输出程序运行时间

        mystackMin2.push(5);
        mystackMin2.push(75);
        mystackMin2.push(85);
        mystackMin2.push(4);
        mystackMin2.pop();

        long startTime2 = System.nanoTime(); //获取开始时间
        mystackMin2.getmin(); //测试的代码段
        long endTime2 = System.nanoTime(); //获取结束时间

        System.out.println("程序2运行时间：" + (endTime2 - startTime2) + "  " + mystackMin2.getmin()); //输出程序运行时间
    }
}


