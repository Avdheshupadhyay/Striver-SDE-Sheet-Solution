class Solution {
    int res=Integer.MIN_VALUE;
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=dfs(root.left);
        int right=dfs(root.right);
        int leftORright=Math.max(left+root.val,right+root.val);
        int onlyroot=root.val;
        int leftTOright=left+right+root.val;
        int maximum=Math.max(leftORright,Math.max(onlyroot,leftTOright));
        res=Math.max(res,maximum);
        return Math.max(onlyroot,leftORright);
    }
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
        
    }
}
