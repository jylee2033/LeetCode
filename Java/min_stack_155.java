package Java;

import java.util.Stack;

class MinStack {
  Stack<Integer> stack;
  Stack<Integer> min;

  public MinStack() {
    stack = new Stack<>();
    min = new Stack<>();
  }

  public void push(int val) {
    if (stack.empty()) {
      stack.push(val);
      min.push(val);
    } else if (val > min.peek()) {
      min.push(min.peek());
      stack.push(val);
    } else {
      min.push(val);
      stack.push(val);
    }
  }

  public void pop() {
    stack.pop();
    min.pop();
  }

  public int top() {
    int top = stack.peek();
    return top;
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