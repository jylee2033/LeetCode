package Java;

// Definition for singly-linked list.
class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}

class LinkedListCycle {
  public boolean hasCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;

      if (fast == slow) {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(3);
    head.next = new ListNode(2);
    head.next.next = new ListNode(0);
    head.next.next.next = new ListNode(-4);
    // int pos = 1;
    // head.next.next.next.next = head.next;

    LinkedListCycle solution = new LinkedListCycle();
    boolean hasCycle = solution.hasCycle(head);

    System.out.println(hasCycle);
  }
}
