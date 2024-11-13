class Solution {
    int maxx = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       solve(root);
        return maxx;
    }
    public int solve(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDia =solve(root.left);
        int rightDia =solve(root.right); 
        maxx = Math.max(maxx,leftDia+rightDia);
        return Math.max(leftDia,rightDia)+1;
    }
}
  