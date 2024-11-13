
class Solution {
    boolean solve(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null)   return true;
        if(root1!=null && root2!=null && root1.val==root2.val){
        return solve(root1.left,root2.right) && solve(root1.right,root2.left);
        }
        else {
            return false;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)   return true;
        TreeNode root1=root.left;
        TreeNode root2=root.right;
      return  solve(root1,root2);
        
    }
}
 