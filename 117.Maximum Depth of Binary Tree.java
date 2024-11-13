class Solution {
    int count = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = maxDepth(root.left) + 1;
            int right = maxDepth(root.right) + 1;
            return Math.max(left, right);
        }

    }
}