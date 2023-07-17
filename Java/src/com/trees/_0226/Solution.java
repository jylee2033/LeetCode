package java.src.com.trees._0226;

import java.src.com.structure.TreeNode;

public class Solution {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }

    TreeNode node = new TreeNode(root.val);
    node.right = invertTree(root.left);
    node.val = root.val;
    node.left = invertTree(root.right);
    return node;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(4, new TreeNode(2), new TreeNode(7));
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(9);

    Solution solution = new Solution();
    solution.invertTree(root);

    System.out.println(root.val);
    System.out.println(root.left.val);
    System.out.println(root.right.val);
    System.out.println(root.left.left.val);
    System.out.println(root.left.right.val);
    System.out.println(root.right.left.val);
    System.out.println(root.right.right.val);
  }
}