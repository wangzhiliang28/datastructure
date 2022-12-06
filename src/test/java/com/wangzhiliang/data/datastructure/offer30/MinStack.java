package com.wangzhiliang.data.datastructure.offer30;

import java.util.Stack;

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
       this.stack=new Stack<>();
       this.minStack=new Stack<>();
    }

    public void push(int x) {
         this.stack.push(x);
        if (this.minStack.isEmpty()) {
            this.minStack.push(x);
        } else {
            this.minStack.push(Math.min(x, this.minStack.peek()));
        }
    }

    public void pop() {
        this.minStack.pop();
        this.stack.pop();
    }

    public int top() {
     return    this.stack.peek();
    }

    public int min() {
        return this.minStack.peek();
    }
}
