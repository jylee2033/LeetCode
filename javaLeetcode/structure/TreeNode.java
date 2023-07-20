package javaLeetcode.structure;

// Definition for a binary tree node.
public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode() {
  }

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  // @param data [xx, null, xx]
  // @return {@link TreeNode}
  public static TreeNode createTestData(String data) {
    if (data == null) {
      return null;
    }

    data = data.substring(1, data.length() - 1);
    String[] split = data.split(",");
    int len = split.length;

    TreeNode[] treeNodes = new TreeNode[len];

    for (int i = 0; i < len; i++) {
      if (split[i] != null) {
        treeNodes[i] = new TreeNode(Integer.valueOf(split[i]));
      }
    }
  }
}