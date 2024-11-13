class Solution {
    List<Integer> a=new ArrayList<>();
    void solve(TreeNode root){
        if(root==null){
            return ;
        }
        solve(root.left);
        a.add(root.val);
        solve(root.right);
    }
    public int kthLargest(TreeNode root, int k) {
        solve(root);
        int n=a.size();
        return a.get(n-k+1);

    }
}
