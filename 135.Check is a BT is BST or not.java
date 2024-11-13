
class Solution {
    List<Integer> a=new ArrayList<>();
    void solve(TreeNode root){
        if(root==null)  return;
        solve(root.left);
        a.add(root.val);
        solve(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null)   return true;
        solve(root);
        int n=a.size();
        for(int i=1;i<n;i++){
            if(a.get(i)<=a.get(i-1))  return false;
        }
        return true;
    }
}
