package java.src.com.linkedlist._0206;

class ReverseLinkedList {
  public ListNode reverseList(ListNode head) {
    ListNode next = null;
    ListNode previous = null;
    ListNode current = head;

    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }

    return previous;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1, new ListNode(2));
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    ReverseLinkedList solution = new ReverseLinkedList();
    ListNode answer = solution.reverseList(head);

    while (answer != null) {
      System.out.println(answer.val);
      answer = answer.next;
    }
  }
}
