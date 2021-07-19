package cn.xaut;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，分别完成在队列尾部插入整数(push)和在队列头部删除整数(pop)的功能。 队列中的元素为int类型。保证操作合法，即保证pop操作时队列内已有元素。
 */
public class JZ5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int node=stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return node;
    }

    public static void main(String[] args) {
        JZ5 jz5=new JZ5();
        jz5.push(1);
        jz5.push(2);
        jz5.push(3);
        System.out.println(jz5.pop());
        System.out.println(jz5.pop());
        System.out.println(jz5.pop());
    }
}
