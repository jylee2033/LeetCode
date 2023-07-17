package javaLeetcode.stackJava._0155;

import java.util.Stack;

class MinStack {
  private final Stack<Integer> stack;
  private final Stack<Integer> min;

  public MinStack() {
    stack = new Stack<>();
    min = new Stack<>();
  }

  public void push(int val) {
    stack.push(val);
    if (min.empty()) {
      min.push(val);
    } else {
      min.push(Math.min(val, min.get(min.size() - 1)));
    }
  }

  public void pop() {
    stack.pop();
    min.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return min.peek();
  }

  public static void main(String[] args) {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-1);
    System.out.println(minStack.getMin());
    System.out.println(minStack.top());
    minStack.pop();
    System.out.println(minStack.getMin());
  }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */