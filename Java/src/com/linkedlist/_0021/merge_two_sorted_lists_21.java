package Java.src.com.linkedlist._0021;

import Java.src.com.linkedlist._0141.ListNode;

class MergeTwoSortedLists {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    final ListNode root = new ListNode();
    ListNode mergedList = root;

    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        mergedList.next = list1;
        list1 = list1.next;
      } else {
        mergedList.next = list2;
        list2 = list2.next;
      }

      mergedList = mergedList.next;
    }

    if (list1 == null) {
      mergedList.next = list2;
    } else if (list2 == null) {
      mergedList.next = list1;
    }

    return root.next;
  }

  public static void main(String[] args) {
    ListNode list1 = new ListNode(1, new ListNode(2));
    list1.next.next = new ListNode(3);
    ListNode list2 = new ListNode(4, new ListNode(5));
    list2.next.next = new ListNode(6);

    MergeTwoSortedLists solution = new MergeTwoSortedLists();
    ListNode answer = solution.mergeTwoLists(list1, list2);

    while (answer != null) {
      System.out.println(answer.val);
      answer = answer.next;
    }
  }
}