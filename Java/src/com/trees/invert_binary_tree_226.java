package Java;

//  Definition for a binary tree node.
class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class InvertBinaryTree {
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

    InvertBinaryTree solution = new InvertBinaryTree();
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