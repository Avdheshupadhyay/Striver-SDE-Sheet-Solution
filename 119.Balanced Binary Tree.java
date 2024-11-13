
class Solution {
    int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);
    int diff=Math.abs(height(root.left)-height(root.right));
    if(left && right && diff<=1){
        return true;
    }
    else{
        return false;
    }
        
    }
}