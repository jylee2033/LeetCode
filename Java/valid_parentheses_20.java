package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class ValidParentheses {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    Map<Character, Character> hashMap = new HashMap<Character, Character>();

    hashMap.put(')', '(');
    hashMap.put(']', '[');
    hashMap.put('}', '{');

    if (s.length() % 2 != 0) {
      return false;
    }

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (hashMap.containsValue(c)) {
        stack.push(c);
      } else if (hashMap.containsKey(c) && !stack.empty() && stack.peek() == hashMap.get(c)) {
        stack.pop();
      } else {
        return false;
      }
    }

    return stack.empty();
  }

  public static void main(String[] args) {
    String s = "([}}])";

    ValidParentheses solution = new ValidParentheses();
    boolean isValid = solution.isValid(s);

    System.out.println(isValid);
  }
}
