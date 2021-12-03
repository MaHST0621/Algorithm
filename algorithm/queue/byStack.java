package queue;


import java.util.Stack;

/**
 * @Author Mahe
 * @Date 2021/2/19 19:01
 * @Version 1.0
 */


class byStack {

    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public byStack(){
        this.stackPop = new Stack<Integer>();
        this.stackPush = new Stack<Integer>();
    }

    public void pushToPop(){
        if (this.stackPop.isEmpty()){
            while (!this.stackPush.isEmpty()){
                this.stackPop.push(this.stackPush.pop());
            }
        }
    }

    public void add(int newNumber){
        this.stackPush.push(newNumber);
        pushToPop();
    }

    public int poll(){
        if (this.stackPop.isEmpty() && this.stackPush.isEmpty()) {
            throw new RuntimeException("Queue is empty.");
        }
        pushToPop();
        return this.stackPop.pop();
    }

    public int peek() {
        if (this.stackPop.isEmpty() && this.stackPush.isEmpty()) {
            throw new RuntimeException("Queue is empty.");
        }

        pushToPop();
        return stackPop.pop();
    }

    public static void main(String[] args) {
        byStack byStack2 = new byStack();

        byStack2.add(5);
        byStack2.add(45);
        byStack2.add(88);
        byStack2.peek();
    }
}
